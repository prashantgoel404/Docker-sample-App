package com.assignment.sample.controller;

import com.assignment.sample.entity.ExampleRequest;
import com.assignment.sample.entity.ExampleResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/example")
public class Controller {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @PostMapping("/create")
    public ExampleResponse createExample(@RequestBody ExampleRequest request) {
        return new ExampleResponse("Success", request.getName(), request.getAge());
    }
}
