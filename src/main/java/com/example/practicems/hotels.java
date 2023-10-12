package com.example.practicems;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class hotels {
    @GetMapping("/hotels")
    public String getData () {return "hello I am Moin book a hotel for me" ;}
}
