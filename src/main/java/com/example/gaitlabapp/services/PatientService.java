package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.patients.IPatientModel;
import com.example.gaitlabapp.repo.PatientRepo;
import com.example.gaitlabapp.services.impl.PatientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface PatientService {
    IPatientModel save(IPatientModel patientModel);
    IPatientModel update(IPatientModel patientModel);
    Optional<IPatientModel> findByFirstName(String firstName);
    Optional<IPatientModel> findByLastName(String lastName);
    Optional<IPatientModel> findByMrn(String mrn);
    IPatientModel findAll();
    void delete(Long id);
}
