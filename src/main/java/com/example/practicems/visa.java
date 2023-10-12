package com.example.practicems;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class visa {
    @GetMapping("/visa")
    public String getData () {return "book visa for dubai" ;}
}
