package com.example.lab4_senyura;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @GetMapping
    public String printName() {
        return "Senyura Yurii\n Lab4";
    }
}
