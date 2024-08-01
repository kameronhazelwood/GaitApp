package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.patients.IPatientModel;

import java.util.List;
import java.util.Optional;

public interface PatientService {
    IPatientModel save(IPatientModel patientModel);
    IPatientModel update(IPatientModel patientModel);
    Optional<IPatientModel> findByFirstName(String firstName);
    Optional<IPatientModel> findByLastName(String lastName);
    Optional<IPatientModel> findByMrn(String mrn);
    List<IPatientModel> findAll();
    void delete(Long id);
}
