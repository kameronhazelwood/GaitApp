package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.IMovementDisorderModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovementDisorderRepo extends JpaRepository<IMovementDisorderModel, String> {
    List<IMovementDisorderModel> findAll();
}
