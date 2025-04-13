package com.benja.ben.controller;

import com.benja.ben.dto.Message;
import com.benja.ben.dto.UsernameDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/app")
    private Message login(@RequestBody UsernameDto usernameDto){
        return Message.builder()
                .message("Usuario inicio sesión correctamente")
                .build();
    }
}
