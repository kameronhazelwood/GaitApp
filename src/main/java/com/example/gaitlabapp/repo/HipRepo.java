package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.videoAssessment.IHipModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HipRepo extends JpaRepository<IHipModel, String> {
    List<IHipModel> findAll();
}
