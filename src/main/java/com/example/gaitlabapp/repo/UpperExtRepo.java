package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.videoAssessment.IUpperExtModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UpperExtRepo extends JpaRepository<IUpperExtModel, String> {
    List<IUpperExtModel> findAll();
}
