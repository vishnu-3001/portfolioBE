package com.vishnu.repository;

import com.vishnu.model.ExperienceModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ExperienceRepository extends JpaRepository<ExperienceModel,Integer> {
    
}