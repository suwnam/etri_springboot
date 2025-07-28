package com.example.dockerDemo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class BuildResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String jobName;
    private int buildNumber;
    private String status;
    private LocalDateTime timestamp;

    // Constructors, Getters, Setters

    public BuildResult() {}

    public BuildResult(String jobName, int buildNumber, String status, LocalDateTime timestamp) {
        this.jobName = jobName;
        this.buildNumber = buildNumber;
        this.status = status;
        this.timestamp = timestamp;
    }

    // Getters and Setters...
}

