package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aaa")
public class c {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cc(){
        System.out.println("control******************");
    }
}
