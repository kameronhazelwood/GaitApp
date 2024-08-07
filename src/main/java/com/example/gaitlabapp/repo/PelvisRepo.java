package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.videoAssessment.IPelvisModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PelvisRepo extends JpaRepository<IPelvisModel, String> {
    List<IPelvisModel> findAll();
}
