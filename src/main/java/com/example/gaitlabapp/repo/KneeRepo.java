package com.example.gaitlabapp.repo;


import com.example.gaitlabapp.model.forms.videoAssessment.IKneeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KneeRepo extends JpaRepository<IKneeModel, String> {
    List<IKneeModel> findAll();
}
