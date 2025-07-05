package com.vishnu.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name="degrees")
public class Degree {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    public long getId() {
        return id;
    }

    private String degree;

    public String getDegree() {
        return degree;
    }


    public void setDegree(String degree) {
        this.degree = degree;
    }

    private String major;

    public String getMajor() {
        return major;
    }


    public void setMajor(String major) {
        this.major = major;
    }
    private String college;

    public String getCollege() {
        return college;
    }


    public void setCollege(String college) {
        this.college = college;
    }
    private String year;

    public String getYear() {
        return year;
    }


    public void setYear(String year) {
        this.year = year;
    }

    @ElementCollection
    @CollectionTable(name="degree_courses",joinColumns = @JoinColumn(name="degree_id"))
    @Column(name="course")
    private List<String>courses=new ArrayList<>();

    public List<String> getCourses() {
        return courses;
    }


    public void setCourses(List<String> courses) {
        this.courses = courses;
    }
    public Degree(){}
    public Degree(String degree,String major,String college,String year,List<String>courses){
        this.degree=degree;
        this.major=major;
        this.college=college;
        this.year=year;
        this.courses=courses;
    }

}
