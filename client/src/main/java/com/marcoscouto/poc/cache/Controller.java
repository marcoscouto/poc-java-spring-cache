package com.marcoscouto.poc.cache;

import org.springframework.cache.CacheManager;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final Client client;
    private final CacheManager cacheManager;

    public Controller(Client client, CacheManager cacheManager) {
        this.client = client;
        this.cacheManager = cacheManager;
    }

    @GetMapping("/hello")
    public ResponseEntity response(@RequestParam(required = false) String option) {

        if (option != null && option.equals("cancel")) {
            cacheManager.getCache("message").clear();
        }

        Response response = client.response();
        return ResponseEntity.ok(response);
    }

}
