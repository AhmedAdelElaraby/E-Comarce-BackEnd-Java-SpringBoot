package com.example.demo.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.auth.dto.BaseResponse;
import com.example.demo.auth.dto.DataRegister;
import com.example.demo.auth.dto.ResponseRegister;
import com.example.demo.auth.entity.User;
import com.example.demo.auth.mapper.MapperRegister;
import com.example.demo.auth.repository.RegisterRepository;

import lombok.RequiredArgsConstructor;

@Service

public class RegisterService {

     private final RegisterRepository registerRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired  
    public RegisterService(RegisterRepository registerRepository, PasswordEncoder passwordEncoder) {
        this.registerRepository = registerRepository;
        this.passwordEncoder = passwordEncoder;
    }
 
    public BaseResponse register (DataRegister request) {

        User user = MapperRegister.toEntity(request);

        user.setPassword(passwordEncoder.encode(user.getPassword()));

        registerRepository.save(user);

        ResponseRegister response = MapperRegister.toResponse(user);
        return BaseResponse.builder()
                .statusCode(201)
                .message(true)
                .data(response)
                .build();
    }

   

}
