package com.vishnu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vishnu.service.PortfolioService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/portfolio")
public class PortfolioController {
    private final PortfolioService portfolioService;
    public PortfolioController(PortfolioService ps){
        this.portfolioService =ps;
    }  
    @GetMapping("/hello")
    public String helloWorld() {
        return portfolioService.getPortfolioDetails();
    }
      
}
