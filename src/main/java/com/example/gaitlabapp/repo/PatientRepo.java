package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.patients.IPatientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PatientRepo extends JpaRepository<IPatientModel, String> {

    Optional<IPatientModel> findByFirstName(String firstName);
    Optional<IPatientModel> findByLastName(String lastName);
    Optional<IPatientModel> findByMrn(String mrn);
    List<IPatientModel> findAll();


}
