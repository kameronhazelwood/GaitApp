package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.IToneModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToneRepo extends JpaRepository<IToneModel, String> {
    List<IToneModel> findAll();
}
