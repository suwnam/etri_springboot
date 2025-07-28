package com.example.dockerDemo.repository;

import com.example.dockerDemo.entity.BuildStat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BuildStatRepository extends JpaRepository<BuildStat, Long> {

    @Query("SELECT COUNT(b) FROM BuildStat b WHERE b.status = 'SUCCESS'")
    long countSuccess();

    @Query("SELECT COUNT(b) FROM BuildStat b WHERE b.status = 'FAILURE'")
    long countFailure();
}
