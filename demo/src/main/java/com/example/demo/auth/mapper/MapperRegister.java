package com.example.demo.auth.mapper;

import com.example.demo.auth.dto.DataRegister;
import com.example.demo.auth.dto.ResponseRegister;
import com.example.demo.auth.entity.User;

public class MapperRegister {
    public static User toEntity(DataRegister request) {
        return User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .password(request.getPassword())
                .phoneNumber(request.getPhoneNumber())
                .city(request.getCity())
                .country(request.getCountry())
                .gender(request.getGender())
                .build();
    }

    public static ResponseRegister toResponse(User user) {
        return ResponseRegister.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .phoneNumber(user.getPhoneNumber())
                .city(user.getCity())
                .country(user.getCountry())
                .gender(user.getGender())
                .createdAt(user.getCreatedAt())
                .updatedAt(user.getUpdatedAt())
                .build();
    }
}
