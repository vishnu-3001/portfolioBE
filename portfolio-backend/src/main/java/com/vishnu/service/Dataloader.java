package com.vishnu.service;

import java.io.InputStream;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vishnu.repository.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.vishnu.model.*;
import java.util.*;

@Component
public class Dataloader implements ApplicationRunner {
    private final DegreeRepository degreerepo;
    private final ExperienceRepository exprepo;
    private final ProjectRepository projectrepo;
    private final ObjectMapper objMapper=new ObjectMapper();
    public Dataloader(DegreeRepository degree,ExperienceRepository experience,ProjectRepository projectrepo){
        this.degreerepo=degree;
        this.exprepo=experience;
        this.projectrepo=projectrepo;
    }
    @Override
    public void run(ApplicationArguments arg) throws Exception{
        if(degreerepo.count()==0){
            try {
                InputStream inputStream=getClass().getResourceAsStream("/degrees.json");
                List<Degree> degrees = objMapper.readValue(inputStream, new TypeReference<>() {});
                degreerepo.saveAll(degrees);
            }finally{
                System.out.println("Completed storing of degrees");
            }
        }
        if(exprepo.count()==0){
            try{
                InputStream inputStream=getClass().getResourceAsStream("/experiences.json");
                List<Experience>experiences=objMapper.readValue(inputStream,new TypeReference<>(){});
                exprepo.saveAll(experiences);
            }finally{
                System.out.println("Completed storing of experiences");
            }
        }
        if(projectrepo.count()==0){
            try{
                InputStream inputStream=getClass().getResourceAsStream("/projects.json");
                List<Project>projects=objMapper.readValue(inputStream,new TypeReference<>(){});
                projectrepo.saveAll(projects);
            }
            finally{
                System.out.println("Projects stored successfully");
            }
        }
    }
}
