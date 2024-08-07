package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.IMotorControlModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MotorControlRepo extends JpaRepository<IMotorControlModel, String> {
    List<IMotorControlModel> findAll();
}
