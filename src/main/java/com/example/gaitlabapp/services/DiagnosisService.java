package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.patients.IDiagnosisModel;

import java.util.List;
import java.util.Optional;
public interface DiagnosisService {
    Optional<IDiagnosisModel> save(IDiagnosisModel diagnosisModel);
    Optional<IDiagnosisModel> findByCode(String code);
    Optional<IDiagnosisModel> findByDescription(String description);
    List<IDiagnosisModel> findAll();
    void delete(Long id);
}
