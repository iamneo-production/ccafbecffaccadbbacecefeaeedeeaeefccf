package com.example.springapp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ApiController {
@GetMapping("/")
public string welcome()
{
  return "Welcome String Boot";
}
    
}
