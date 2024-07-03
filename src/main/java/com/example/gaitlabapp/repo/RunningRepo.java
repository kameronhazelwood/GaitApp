package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.IRunningStrengthModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RunningRepo extends JpaRepository<IRunningStrengthModel, String> {
    List<IRunningStrengthModel> findAll();
}
