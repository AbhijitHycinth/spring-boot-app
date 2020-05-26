package com.example.tutorials.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/hello")
    public ResponseEntity hello(
        @RequestParam(value = "name") String name
    ){
        return ResponseEntity.ok("Hello" + name);
    }
}