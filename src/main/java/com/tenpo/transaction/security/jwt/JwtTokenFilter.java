package com.tenpo.transaction.security.jwt;

import com.tenpo.transaction.exception.AuthorizationException;
import com.tenpo.transaction.security.services.imp.UserDetailServiceImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtTokenFilter extends OncePerRequestFilter {

    private static final Logger logger = LoggerFactory.getLogger(JwtTokenFilter.class);

    @Autowired
    JwtProvider provider;

    @Autowired
    UserDetailServiceImp userDetailService;

    @Override
    protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res, FilterChain filterChain) throws ServletException, IOException {
        try {
            String token = getToken(req);
            logger.info("Token " + token);
            logger.info("Provider " + provider);
            if (token != null && provider.validateToken(token)) {
                logger.info("token is not null");
                String username = provider.getUsernameFromToken(token);
                logger.info("Username " + username);
                UserDetails userDetails = userDetailService.loadUserByUsername(username);
                UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                SecurityContextHolder.getContext().setAuthentication(auth);
            }
        } catch(AuthorizationException e) {
            logger.error("Error authentication", e.getMessage());
            throw new ServletException(e.getMessage());
        } catch(NullPointerException e) {
            logger.error("Error nullPointer", e.getMessage());
            throw new ServletException(e.getMessage());
        } catch (Exception e) {
            logger.error("Error doFilterToken " + e.getMessage());
            e.printStackTrace();
        }
        filterChain.doFilter(req, res);
    }

    private String getToken(HttpServletRequest request) {
        String token = request.getHeader("Authorization");
        if(token != null && token.startsWith("Bearer")){
            return token.replace("Bearer ", "");
        }
        return null;
    }
}
