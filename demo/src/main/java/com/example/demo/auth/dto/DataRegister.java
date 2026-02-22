package com.example.demo.auth.dto;

import lombok.Data;

@Data
public class DataRegister {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String confirmPassword;
    private String phoneNumber;
    private String city;
    private String country;
    private String gender;
    private String dateOfBirth;
}
