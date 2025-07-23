package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.ITherapyRecomModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TherapyRecomRepo extends JpaRepository<ITherapyRecomModel, String> {
}
