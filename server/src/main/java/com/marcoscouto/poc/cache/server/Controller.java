package com.marcoscouto.poc.cache.server;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {

    @GetMapping("/message")
    public ResponseEntity hello(){
        Map response = new HashMap();
        response.put("message", "hello!");
        return ResponseEntity.ok(response);
    }

}
