package com.vishnu.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "experiences")
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String company;
    private String role;
    private String dates;
    
    @ElementCollection
    @CollectionTable(name="experience_tech",joinColumns = @JoinColumn(name="experience_id"))
    @Column(name="technology")
    private List<String> tech;


    @ElementCollection
    @CollectionTable(name = "experience_description", joinColumns = @JoinColumn(name = "experience_id"))
    @Column(name = "description",columnDefinition = "TEXT")
    private List<String> description;


    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }
    public List<String> getTech() {
        return tech;
    }

    public void setTech(List<String> tech) {
        this.tech = tech;
    }

    public Experience() {}

    public Experience(String company, String role, String dates,List<String> tech, List<String> description) {
        this.company = company;
        this.role = role;
        this.dates = dates;
        this.tech=tech;
        this.description=description;
    }

    public Long getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }
}