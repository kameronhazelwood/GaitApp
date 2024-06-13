package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.patients.IPatientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PatientRepo extends JpaRepository<IPatientModel, String> {

    Optional<IPatientModel> findByFname(String fName);
    Optional<IPatientModel> findByLname(String lName);
    Optional<IPatientModel> findByMrn(String mrn);
    List<IPatientModel> findAll();


}
