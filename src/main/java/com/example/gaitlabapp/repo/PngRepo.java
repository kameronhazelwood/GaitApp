package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.patients.IPngModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PngRepo extends JpaRepository<IPngModel, String> {
    List<IPngModel> findAll();
}
