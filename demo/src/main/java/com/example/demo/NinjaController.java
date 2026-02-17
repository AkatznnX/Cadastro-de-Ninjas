package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NinjaController {
    @GetMapping("/first")
    public String ola(){
        return "meu primeiro getmapping";
    }
}
