package com.vishnu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vishnu.service.*;
import com.vishnu.model.*;
import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/portfolio")
public class PortfolioController {

    private final ProjectService projectService;
    private final PortfolioService portfolioService;
    private final ExperienceService experienceService;
    private final DegreeService degreeService;
    public PortfolioController(PortfolioService ps, ProjectService projectService,ExperienceService es,DegreeService ds){
        this.portfolioService =ps;
        this.projectService = projectService;
        this.experienceService=es;
        this.degreeService=ds;
    }  
    @GetMapping("/hello")
    public String helloWorld() {
        return portfolioService.getPortfolioDetails();
    }
    @GetMapping("/projects")
    public List<Project> getProjects(){
        return projectService.getAllProjects();
    }
    @GetMapping("/experiences")
    public List<Experience> getExperiences(){
        return experienceService.getAllExperiences();
    }
    @GetMapping("/degrees")
    public List<Degree>getDegrees(){
        return degreeService.getAllDegrees();
    } 
}
