package com.example.demo.auth.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.auth.dto.BaseResponse;
import com.example.demo.auth.dto.DataRegister;
import com.example.demo.auth.service.RegisterService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/auth")
public class RegisterController {

    
     private final RegisterService registerService;

   
    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }
   
     @PostMapping("/register") 
    public ResponseEntity<BaseResponse> register(@RequestBody DataRegister dataRegister) {

        return   ResponseEntity.ok(registerService.register(dataRegister));


         
    }



}
