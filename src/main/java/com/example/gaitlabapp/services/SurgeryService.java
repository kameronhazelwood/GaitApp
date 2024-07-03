package com.example.gaitlabapp.services;


import com.example.gaitlabapp.model.patients.ISurgeryModel;

import java.util.List;
import java.util.Optional;
public interface SurgeryService {
    Optional<ISurgeryModel> save(ISurgeryModel surgeryModel);
    Optional<ISurgeryModel> findBySurgeryProcedure(String surgeryProcedure);
    Optional<ISurgeryModel> findBySurgeryId(String surgeryId);
    Optional<ISurgeryModel> findBySurgeryDate(String surgeryDate);
    List<ISurgeryModel> findAll();
    void delete(Long id);
}
