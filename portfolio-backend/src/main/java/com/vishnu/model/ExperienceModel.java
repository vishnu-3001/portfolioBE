package com.vishnu.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "experience")
public class ExperienceModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "company", nullable = false)
    private String company;

    @ElementCollection
    @CollectionTable(name = "experience_tech", joinColumns = @JoinColumn(name = "experience_id"))
    @Column(name = "tech")
    private List<String> tech;

    @ElementCollection
    @CollectionTable(name = "experience_description", joinColumns = @JoinColumn(name = "experience_id"))
    @Column(name = "description")
    private List<String> description;

    @Column(name = "dates", nullable = false)
    private String dates;

    // Constructors, getters, setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public List<String> getTech() {
        return tech;
    }

    public void setTech(List<String> tech) {
        this.tech = tech;
    }

    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }
    public ExperienceModel() {
        // Required by JPA
    }


    public ExperienceModel(String role, String company, List<String> tech, List<String> description, String dates) {
        this.role = role;
        this.company = company;
        this.tech = tech;
        this.description = description;
        this.dates = dates;
    }

}

