package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.hipscores.IHipScoresModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HipScoreRepo extends JpaRepository<IHipScoresModel, String> {
    List<IHipScoresModel> findAll();
}
