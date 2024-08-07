package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.videoAssessment.IFootConditionsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FootConditionsRepo extends JpaRepository<IFootConditionsModel, String> {
    List<IFootConditionsModel> findAll();
}
