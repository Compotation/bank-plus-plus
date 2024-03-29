package com.teamplusplus.bankplusplus.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class MainController {
  @GetMapping({"/time", "/"})
  public LocalDateTime getTime() {
    return LocalDateTime.now();
  }
}