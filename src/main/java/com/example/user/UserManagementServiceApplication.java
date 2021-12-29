package com.example.user;

import com.example.user.constant.FileConstant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.io.File;

@SpringBootApplication
public class UserManagementServiceApplication {


    public static void main(String[] args) {
        SpringApplication.run(UserManagementServiceApplication.class, args);
        new File(FileConstant.USER_FOLDER).mkdirs();
    }

    @Bean
    BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
