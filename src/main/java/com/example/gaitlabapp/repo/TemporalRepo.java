package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.ITemporalModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemporalRepo extends JpaRepository<ITemporalModel, String> {
}
