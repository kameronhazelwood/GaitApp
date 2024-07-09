package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.patients.IHealthHistoryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface HealthHistoryRepo extends JpaRepository<IHealthHistoryModel, String> {
    Optional<IHealthHistoryModel> findByCondition(String healthHistoryName);
   // Optional<IHealthHistoryModel> findByHealthId(Integer healthHistoryId);
}
