package com.br.cleverson.spring_security_jwt.security;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    private final JwtService jwtService;

    

    public AuthenticationService(JwtService jwtService) {
        this.jwtService = jwtService;
    }



    public String authenticate(Authentication authentication){
        return  jwtService.genereateToken(authentication);
    }
}
