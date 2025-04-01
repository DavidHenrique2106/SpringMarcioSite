package com.example.demo;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Map;

@RestController
@RequestMapping("/info")
@CrossOrigin(origins = "http://localhost:3000")
public class InfoController {

    @GetMapping
    public ResponseEntity<Map> getInfo() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://dog.ceo/api/breeds/image/random"; 

        ResponseEntity<Map> response = restTemplate.getForEntity(url, Map.class);
        return ResponseEntity.ok(response.getBody());
    }
}
