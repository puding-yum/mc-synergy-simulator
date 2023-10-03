package com.pudingyum.magicchess.controller;

import com.pudingyum.magicchess.domain.dto.UserLoginDto;
import com.pudingyum.magicchess.service.AuthService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v1/auth")
public class AuthController {
    @Autowired
    AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<Object> register(@Valid @RequestBody UserLoginDto userLoginDto){
        return authService.register(userLoginDto);
    }

    @PostMapping("/login")
    public ResponseEntity<Object> login(@Valid @RequestBody UserLoginDto userLoginDto){
        return authService.login(userLoginDto);
    }
}
