package com.example.dockerDemo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class BuildStat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String jobName;
    private String status; // SUCCESS, FAILURE 등
    private long duration; // milliseconds
    private LocalDateTime timestamp;

    // Getters/Setters 생략 가능 (Lombok 사용 가능)
}

