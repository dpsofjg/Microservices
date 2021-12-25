package com.example.apigateway.controller;

import com.example.apigateway.dto.Foo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.apache.commons.lang.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang.RandomStringUtils.randomNumeric;

@RestController
public class FooController {

    @GetMapping("/foos/{id}")
    public Foo findById(@PathVariable long id, HttpServletRequest req, HttpServletResponse res) {
        return new Foo(Long.parseLong(randomNumeric(2)), randomAlphabetic(4));
    }
}
