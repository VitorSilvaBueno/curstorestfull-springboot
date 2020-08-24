package com.example.aula170820.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeuControle {
    @GetMapping("/hello")
    public String helloWorld(){
        return "fala gato";
    }
}