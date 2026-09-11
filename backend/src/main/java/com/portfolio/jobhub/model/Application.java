package com.portfolio.jobhub.model;

import jakarta.persistence.*; import java.time.Instant;
@Entity @Table(name="applications", uniqueConstraints=@UniqueConstraint(columnNames={"job_id","email"}))
public class Application { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @ManyToOne(optional=false) private Job job; private String name; private String email; private String status="APPLIED"; private Instant appliedAt=Instant.now(); public Long getId(){return id;} public Job getJob(){return job;} public void setJob(Job v){job=v;} public String getName(){return name;} public void setName(String v){name=v;} public String getEmail(){return email;} public void setEmail(String v){email=v;} public String getStatus(){return status;} public void setStatus(String v){status=v;} public Instant getAppliedAt(){return appliedAt;} }
