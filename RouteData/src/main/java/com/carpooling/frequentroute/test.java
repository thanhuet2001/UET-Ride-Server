package com.carpooling.frequentroute;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @GetMapping("/huhu")
    public String welcome() {
        return "XD XD XD";

    }
}
