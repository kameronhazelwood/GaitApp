package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.patients.ISurgeryModel;
import com.example.gaitlabapp.repo.SurgeryRepo;
import com.example.gaitlabapp.services.SurgeryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SurgeryServiceImpl implements SurgeryService {
    private final SurgeryRepo surgeryRepo;
    @Override
    public Optional<ISurgeryModel> save(ISurgeryModel surgeryModel) {
        return Optional.of(surgeryRepo.save(surgeryModel));
    }

    @Override
    public Optional<ISurgeryModel> findBySurgeryProcedure(String surgeryProcedure) {
        return surgeryRepo.findBySurgeryProcedure(surgeryProcedure);
    }

    @Override
    public Optional<ISurgeryModel> findBySurgeryId(String surgeryId) {
        return surgeryRepo.findBySurgeryId(surgeryId);
    }

    @Override
    public Optional<ISurgeryModel> findBySurgeryDate(String surgeryDate) {
        return surgeryRepo.findBySurgeryDate(surgeryDate);
    }

    @Override
    public List<ISurgeryModel> findAll() {
        return surgeryRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        surgeryRepo.deleteById(String.valueOf(id));
    }
}
