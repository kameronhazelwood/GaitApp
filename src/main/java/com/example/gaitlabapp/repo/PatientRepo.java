package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.patients.IPatientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PatientRepo extends JpaRepository<IPatientModel, String> {

    IPatientModel findByFirstName(String firstName);
    Optional<IPatientModel> findByLastName(String lastName);
   // IPatientModel findByPatientId(Integer patientId);
    List<IPatientModel> findAll();
    IPatientModel findByMrn(String mrn);
//    IPatientModel findByImageName(String imagePath);
//    IPatientModel findByPatientId(Integer patientId);
}
