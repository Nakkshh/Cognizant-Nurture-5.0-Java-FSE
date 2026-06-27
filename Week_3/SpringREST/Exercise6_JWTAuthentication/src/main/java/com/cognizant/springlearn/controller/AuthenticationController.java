package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.util.JwtUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public String authenticate(@RequestHeader("Authorization") String auth){

        String base64=auth.substring(6);

        String credentials=new String(Base64.getDecoder().decode(base64));

        String username=credentials.split(":")[0];

        String token=JwtUtil.generateToken(username);

        return "{\"token\":\""+token+"\"}";
    }

}