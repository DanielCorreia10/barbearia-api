package com.example.barbearia_api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getCliente(){
        return "Hello Daniel!";
    }
}
