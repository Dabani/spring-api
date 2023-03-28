package com.dabanispring.springapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
  
  @GetMapping("/welcome")
  public String welcome() {
    return "Welcome to my first spring api!";
  }
}
