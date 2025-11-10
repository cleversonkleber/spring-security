package com.br.cleverson.spring_security_jwt.web;

import org.springframework.web.bind.annotation.RestController;

import com.br.cleverson.spring_security_jwt.security.AuthenticationService;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;




@RestController
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService){
        this.authenticationService = authenticationService;
    }
    

    @PostMapping("authenticate")
    public String autenticate(Authentication authenticaton) {

        return authenticationService.authenticate(authenticaton);
    }
    
   
    
}
