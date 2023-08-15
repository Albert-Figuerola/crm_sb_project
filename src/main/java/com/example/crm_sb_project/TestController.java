package com.example.crm_sb_project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String holaMundo() {
        return "Hola Mundo";
    }
}
