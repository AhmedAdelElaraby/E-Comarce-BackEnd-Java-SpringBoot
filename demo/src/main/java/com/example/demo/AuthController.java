package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public String register(@RequestBody User user) {

        // تحقق لو الايميل موجود
        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            return "Email already exists!";
        }

        // احفظ المستخدم
        userRepository.save(user);
        return "User registered successfully!";
    }



    @PostMapping("/login")
public String login(@RequestBody User user) {
    return userRepository.findByEmail(user.getEmail())
            .map(u -> {
                if (u.getPassword().equals(user.getPassword())) {
                    // إنشاء توكن
                    String token = JwtUtil.generateToken(u.getEmail());
                    return token;
                } else {
                    return "Invalid password!";
                }
            }).orElse("User not found!");
}





}
