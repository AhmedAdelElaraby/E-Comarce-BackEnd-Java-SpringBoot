package com.example.demo.auth.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User  extends BaseEntity {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private String city;
    private String country;
    private String gender;

}
