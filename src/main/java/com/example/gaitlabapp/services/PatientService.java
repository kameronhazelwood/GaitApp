package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.patients.IPatientModel;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface PatientService {
    IPatientModel save(IPatientModel patientModel);
    IPatientModel update(IPatientModel patientModel);
    IPatientModel findByFirstName(String firstName);
    Optional<IPatientModel> findByLastName(String lastName);
    IPatientModel findByMrn(String mrn);
    List<IPatientModel> findAll();

    boolean findDistinctByMrn(String mrn);

    //  String uploadFileToDirectory(MultipartFile file) throws IOException;
//    byte[] downloadFileFromFileDirectory(String imagePath) throws IOException;
//    IPatientModel findByImagePath(String imagePath);
//    IPatientModel findByPatientId(Integer patientId);
    void delete(Long id);
}
