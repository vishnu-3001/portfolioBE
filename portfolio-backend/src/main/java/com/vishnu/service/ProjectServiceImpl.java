package com.vishnu.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishnu.model.*;
import com.vishnu.repository.*;
import java.util.*;

@Service
public class ProjectServiceImpl implements ProjectService {
    
    @Autowired
    private ProjectRepository projectrepository;

    @Override
    public List<Project>getAllProjects(){
        return projectrepository.findAll();
    }

    @Override
    public Project getProjectById(long id){
        return projectrepository.findById(id).orElse(null);
    }
    @Override
    public Project createProject(Project project){
        return projectrepository.save(project);
    }
    @Override
    public void deleteProject(long id){
        projectrepository.deleteById(id);
    }
}
