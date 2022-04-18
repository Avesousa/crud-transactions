package com.tenpo.transaction.security.controllers;

import com.tenpo.transaction.exception.BadBodyException;
import com.tenpo.transaction.security.dtos.JwtDTO;
import com.tenpo.transaction.security.dtos.UserLoginDTO;
import com.tenpo.transaction.security.dtos.UserRegisterDTO;
import com.tenpo.transaction.security.entities.Rol;
import com.tenpo.transaction.security.entities.User;
import com.tenpo.transaction.security.enums.RolName;
import com.tenpo.transaction.security.jwt.JwtProvider;
import com.tenpo.transaction.security.services.RolService;
import com.tenpo.transaction.security.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.validation.Valid;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthenticationController {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserService userService;

    @Autowired
    RolService rolService;

    @Autowired
    JwtProvider provider;

    @PostMapping("/register")
    public ResponseEntity<?> register(@Valid @RequestBody UserRegisterDTO userRegister, BindingResult bindingResult) throws BadBodyException, ServletException {
        if(bindingResult.hasErrors()){
            throw new BadBodyException("Field bad or email invalid");
        }

        if(userService.existsByUsername(userRegister.getUsername())){
            throw new BadBodyException("Username exist!");
        }

        if(userService.existsByEmail(userRegister.getEmail())) {
            throw new BadBodyException("Email exist!");
        }

        User user = new User(userRegister.getEmail(),userRegister.getUsername(), passwordEncoder.encode(userRegister.getPassword()));

        Set<Rol> roles = new HashSet<Rol>();
        roles.add(rolService.getRolByRolName(RolName.USER).get());
        if(userRegister.getRoles().contains("admin")){
            roles.add(rolService.getRolByRolName(RolName.ADMIN).get());
        }
        user.setRoles(roles);
        userService.save(user);

        return ResponseEntity.ok(user);
    }

    @PostMapping("/login")
    public ResponseEntity<JwtDTO> login(@Valid @RequestBody UserLoginDTO userLogin, BindingResult bindingResult) throws BadBodyException, ServletException {
        if(bindingResult.hasErrors()){
            throw new BadBodyException("Fields bad request");
        }

        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userLogin.getUsername(),userLogin.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = provider.buildToken(authentication);
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        JwtDTO jwt = new JwtDTO(token,userDetails.getUsername(),userDetails.getAuthorities());
        return ResponseEntity.ok(jwt);
    }


}
