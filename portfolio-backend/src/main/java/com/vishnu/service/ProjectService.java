package com.vishnu.service;
import com.vishnu.model.*;
import java.util.*;

import org.springframework.stereotype.Service;

@Service
public interface ProjectService {
    List<Project>getAllProjects();
    Project getProjectById(long id);
    Project createProject(Project project);
    void deleteProject(long id);
    
}
