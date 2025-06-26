package com.vishnu.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vishnu.model.ExperienceModel;
import com.vishnu.repository.ExperienceRepository;
import java.util.*;

@Service
public class ExperienceService {
    private final ExperienceRepository er;

    @Autowired
    public ExperienceService(ExperienceRepository er){ // Corrected parameter name to match common convention, but 'ER' was also fine.
        this.er = er;
    }

    public void saveExperience(){
        List<String> tech = List.of(
            "Angular", "React", "TypeScript", "HTML", "CSS", "Agile", "Microfrontend Architecture"
        );

        List<String> description = List.of(
            "At Danske IT (Infosys), I worked as a Front-End Developer on large-scale financial compliance platforms, where I was deeply involved in modernizing core enterprise applications. My key responsibility was leading the migration of a complex Angular v9 monolith into a modern React-based micro-frontend architecture. This migration dramatically improved the scalability, modularity, and long-term maintainability of the application while enhancing system performance.",
            "One of my most impactful contributions was building a case management dashboard that automated key workflows, improved compliance tracking, and directly increased case closure rates by 400%. This automation also cut work hours by 18%, delivering both business and operational value. I engineered and optimized over 10 reusable UI components tailored for AML (Anti-Money Laundering) and FCLM systems, ensuring compliance and consistency across multiple customer segments.",
            "To further enhance system stability, I implemented robust input validation and API-level integrity checks, which resulted in an 80% reduction in data irregularities and significantly improved reliability. My efforts in optimizing the development process also led to a 30% reduction in debugging time. For these high-impact contributions, I was honored with the GEM (Going Extra Mile) award, recognizing my leadership in delivering high-quality, user-centric solutions while driving 100% sprint success rates. Throughout this period, I actively collaborated with cross-functional teams including product managers, compliance experts, and backend engineers to align technical solutions with evolving business goals."
        );
        ExperienceModel em = new ExperienceModel("Senior Systems Engineer","Danske IT | Infosys",tech,description,"Jan 2022 – Jul 2024");
        er.save(em);
    }
}