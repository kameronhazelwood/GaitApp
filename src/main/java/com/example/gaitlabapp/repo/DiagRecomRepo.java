package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.IDiagRecommendations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiagRecomRepo extends JpaRepository<IDiagRecommendations, String> {
}
