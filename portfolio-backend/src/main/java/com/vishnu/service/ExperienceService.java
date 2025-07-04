package com.vishnu.service;

import com.vishnu.model.*;

import java.util.List;

public interface ExperienceService {
    List<Experience> getAllExperiences();
    Experience getExperienceById(Long id);
    Experience createExperience(Experience experience);
    void deleteExperience(Long id);
}
