package com.example.aula170820.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    @GetMapping("/cliente")
    public String getCliente(){
        return "Nome: João, Código: 10";
    }
    @GetMapping("/cliente/{codigo}")
    public String getClienteByCodigo(@PathVariable int codigo){
        return "vai retornar o cliente de codigo "+codigo;
    }
}