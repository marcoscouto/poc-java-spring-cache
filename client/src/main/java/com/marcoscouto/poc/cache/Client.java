package com.marcoscouto.poc.cache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "client", url = "http://localhost:8081")
public interface Client {

    @Cacheable("message")
    @GetMapping("/message")
    Response response();

}
