package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.patients.IHealthHistoryModel;

import java.util.List;
import java.util.Optional;

public interface HealthHistoryService {
    Optional<IHealthHistoryModel> save(IHealthHistoryModel healthHistoryModel);
    Optional<IHealthHistoryModel> findByCondition(String healthHistoryName);
 //   Optional<IHealthHistoryModel> findById(Integer healthHistoryId);
    List<IHealthHistoryModel> findAll();
    void delete(Long id);
}
