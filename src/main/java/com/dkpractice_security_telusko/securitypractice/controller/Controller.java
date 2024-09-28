package com.dkpractice_security_telusko.securitypractice.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String helloController(HttpServletRequest request){
        return "Hello from Hello Controller sessionId-> "+request.getSession().getId();
    }

}
