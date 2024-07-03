package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.patients.IHealthHistoryModel;
import com.example.gaitlabapp.repo.HealthHistoryRepo;
import com.example.gaitlabapp.services.HealthHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HealthHistoryServiceImpl implements HealthHistoryService {
    private final HealthHistoryRepo healthHistoryRepo;
    @Override
    public Optional<IHealthHistoryModel> save(IHealthHistoryModel healthHistoryModel) {
        return Optional.of(healthHistoryRepo.save(healthHistoryModel));
    }

    @Override
    public Optional<IHealthHistoryModel> findByCondition(String healthHistoryName) {
        return healthHistoryRepo.findByCondition(healthHistoryName);
    }

    @Override
    public Optional<IHealthHistoryModel> findById(String healthHistoryId) {
        return healthHistoryRepo.findById(healthHistoryId);
    }

    @Override
    public List<IHealthHistoryModel> findAll() {
        return healthHistoryRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        healthHistoryRepo.deleteById(String.valueOf(id));
    }
}
