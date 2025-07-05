package com.vishnu.service;
import com.vishnu.model.*;
import java.util.*;


public interface ProjectService {
    List<Project>getAllProjects();
    Project getProjectById(long id);
    Project createProject(Project project);
    void deleteProject(long id);
    
}
