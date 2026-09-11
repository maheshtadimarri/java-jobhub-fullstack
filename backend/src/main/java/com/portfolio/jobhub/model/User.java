package com.portfolio.jobhub.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import java.time.Instant;

@Entity @Table(name="users")
public class User {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @Email @NotBlank @Column(unique=true,nullable=false) private String email;
 @NotBlank @Column(nullable=false) private String credentialHash;
 @Enumerated(EnumType.STRING) @Column(nullable=false) private Role role;
 @Column(nullable=false) private boolean enabled=true;
 @Column(nullable=false) private Instant createdAt=Instant.now();
 public Long getId(){return id;} public String getEmail(){return email;} public void setEmail(String v){email=v;}
 public String getCredentialHash(){return credentialHash;} public void setCredentialHash(String v){credentialHash=v;}
 public Role getRole(){return role;} public void setRole(Role v){role=v;} public boolean isEnabled(){return enabled;} public Instant getCreatedAt(){return createdAt;}
}
