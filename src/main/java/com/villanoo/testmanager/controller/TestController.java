package com.villanoo.testmanager.controller;

import java.security.Principal;
import java.util.concurrent.atomic.AtomicLong;

import com.villanoo.testmanager.domain.AbstractTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/tests2")
public class TestController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> add(@RequestBody AbstractTest input) {
        System.out.println(input.toString());
        return ResponseEntity.noContent().build();
    }
}