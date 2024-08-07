package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.videoAssessment.IRunningModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RunningRepo extends JpaRepository<IRunningModel, String> {
    List<IRunningModel> findAll();
}
