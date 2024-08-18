package com.example.demo.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "external-api", url = "https://api.open-notify.org/iss-now.json")
@Service
public interface ExternalApiClient {

    @GetMapping("/details")
    String getDetails(@RequestParam String query);
}