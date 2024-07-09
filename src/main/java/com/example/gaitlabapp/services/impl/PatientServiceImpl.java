package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.patients.IPatientModel;
import com.example.gaitlabapp.repo.PatientRepo;
import com.example.gaitlabapp.services.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientRepo repo;

    @Override
    public Optional<IPatientModel> save(IPatientModel patientModel) {
        return Optional.of(repo.save(patientModel));
    }

    @Override
    public Optional<IPatientModel> findByFirstName(String firstName) {
        return repo.findByFirstName(firstName);
    }

    @Override
    public Optional<IPatientModel> findByLastName(String lastName) {
        return repo.findByLastName(lastName);
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

