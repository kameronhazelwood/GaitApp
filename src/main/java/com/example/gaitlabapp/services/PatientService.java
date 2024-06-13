package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.patients.IPatientModel;
import com.example.gaitlabapp.repo.PatientRepo;

import java.util.Optional;

public interface PatientService {
    Optional<IPatientModel> save(IPatientModel patientModel);
    Optional<IPatientModel> findByFname(String fName);
    Optional<IPatientModel> findByLname(String lName);
    Optional<IPatientModel> findByMrn(String mrn);
    IPatientModel findAll();
    void delete(Long id);
}
