package com.vishnu.model;

import java.util.*;
import jakarta.persistence.*;


@Entity
@Table(name="projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private String title;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(columnDefinition = "TEXT")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @ElementCollection
    @CollectionTable(name="project_tech",joinColumns = @JoinColumn(name="project_id"))
    @Column(name="technology")
    private List<String>tech;

    public List<String> getTech() {
        return tech;
    }

    public void setTech(List<String> tech) {
        this.tech = tech;
    }
    public Project(){}
    public Project(String title,String description,List<String>tech){
        this.title=title;
        this.description=description;
        this.tech=tech;
    }

}
