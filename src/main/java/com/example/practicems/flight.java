package com.example.practicems;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class flight {
    @GetMapping("/flight")
    public String getData () {return "hello I am Moin Lets fly" ;}
}
