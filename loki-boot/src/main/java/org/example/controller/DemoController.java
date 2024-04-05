package org.example.controller;

import org.example.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("loki")
public class DemoController {

    DemoService service;

    public DemoController(DemoService service) {
        this.service = service;
    }

    @GetMapping
    public void register(){
        service.log();
    }
}
