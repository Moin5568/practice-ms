package com.example.practicems;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class bus {
    @GetMapping("/bus")
    public String getData () {return "hello I am Moin book a bus for me please" ;}
}
