package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.controllers.Forms.Interpretation.UE.InterpretationAssessmentController;
import com.example.gaitlabapp.model.patients.ISurgeryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SurgeryRepo extends JpaRepository<ISurgeryModel, String> {
    Optional<ISurgeryModel> findBySurgeryProcedure(String surgeryProcedure);
    Optional<ISurgeryModel> findBySurgeryId(Integer surgeryId);
    Optional<ISurgeryModel> findBySurgeryDate(String surgeryDate);
}
