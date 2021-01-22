package com.example.demo.controllers;

import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;

@RestController
@Slf4j
public class ApiController {

    @GetMapping("/api/v1")
    public ResponseEntity<String> getByUrl(@RequestParam("name") String name) {
        return new ResponseEntity<String>("Hello " + name, HttpStatus.OK);
    }
	
}
