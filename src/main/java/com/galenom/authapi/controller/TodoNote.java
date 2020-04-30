package com.galenom.authapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoNote {

    @GetMapping("/todo")
    public String getNote() {
        return "Hello World";
    }
}
