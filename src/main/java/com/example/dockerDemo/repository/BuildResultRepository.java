package com.example.dockerDemo.repository;

import com.example.dockerDemo.entity.BuildResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildResultRepository extends JpaRepository<BuildResult, Long> {
}

