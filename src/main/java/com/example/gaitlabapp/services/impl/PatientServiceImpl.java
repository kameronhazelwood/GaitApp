package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.patients.IPatientModel;
import com.example.gaitlabapp.repo.PatientRepo;
import com.example.gaitlabapp.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepo repo;

    @Override
    public Optional<IPatientModel> save(IPatientModel patientModel) {
        return Optional.of(repo.save(patientModel));
    }

    @Override
    public Optional<IPatientModel> findByFname(String fName) {
        return repo.findByFname(fName);
    }

    @Override
    public Optional<IPatientModel> findByLname(String lName) {
        return repo.findByLname(lName);
    }

    @Override
    public Optional<IPatientModel> findByMrn(String mrn) {
        return repo.findByMrn(mrn);
    }

    @Override
    public IPatientModel findAll() {
        return (IPatientModel) repo.findAll();
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(String.valueOf(id));
    }
}

