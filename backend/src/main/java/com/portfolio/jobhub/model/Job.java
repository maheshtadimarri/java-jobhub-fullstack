package com.portfolio.jobhub.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.Instant;

@Entity @Table(name="jobs")
public class Job { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @NotBlank private String title; @NotBlank private String company; @NotBlank private String location; @NotBlank @Column(length=4000) private String description; @NotBlank private String employmentType; private Instant createdAt=Instant.now(); public Long getId(){return id;} public String getTitle(){return title;} public void setTitle(String v){title=v;} public String getCompany(){return company;} public void setCompany(String v){company=v;} public String getLocation(){return location;} public void setLocation(String v){location=v;} public String getDescription(){return description;} public void setDescription(String v){description=v;} public String getEmploymentType(){return employmentType;} public void setEmploymentType(String v){employmentType=v;} public Instant getCreatedAt(){return createdAt;} }
