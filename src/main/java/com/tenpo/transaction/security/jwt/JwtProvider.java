package com.tenpo.transaction.security.jwt;

import com.tenpo.transaction.exception.AuthorizationException;
import com.tenpo.transaction.security.entities.UserMain;
import io.jsonwebtoken.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtProvider {

    private static final Logger logger = LoggerFactory.getLogger(JwtProvider.class);

    @Value("${jwt.secret}")
    private String secret;
    @Value("${jwt.expiration}")
    private Integer expiration;

    public String buildToken(Authentication auth){
        UserMain userMain = (UserMain) auth.getPrincipal();

        return Jwts.builder()
                .setSubject(userMain.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(new Date().getTime() + expiration * 1000))
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }

    public String getUsernameFromToken(String token) {
        return Jwts.parser()
                .setSigningKey(secret)
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }

    public boolean validateToken(String token) throws AuthorizationException {
        logger.info("Validation exp " + expiration);
        logger.info("Validation secret " + secret);
        try {
            logger.info("Validating token");
            Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
            logger.info("Validated token");
            return true;
        } catch (MalformedJwtException e) {
            throw new AuthorizationException("Token mal formed");
        } catch (UnsupportedJwtException e) {
            throw new AuthorizationException("Token not supported");
        } catch (ExpiredJwtException e) {
            throw new AuthorizationException("Token expired");
        } catch (IllegalArgumentException e){
            throw new AuthorizationException("Token empty");
        } catch (SignatureException e) {
            throw new AuthorizationException("Token with error at contract");
        }
    }

}
