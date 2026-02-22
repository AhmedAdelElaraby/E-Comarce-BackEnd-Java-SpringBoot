package com.example.demo.auth.dto;


import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ResponseRegister{
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private String city;
    private String country;
    private String gender;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    
    


}
