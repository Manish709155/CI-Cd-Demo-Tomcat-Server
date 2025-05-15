package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/test/CI/Cd")
@RestController
public class CICDDemoTestRestController {

 @GetMapping("/message")
 public String getMessage(){
    return "My Spring Boot Application CI/CD Deployed On Jenkins.";
    }
}
