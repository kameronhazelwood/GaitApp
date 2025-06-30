package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.IPelvisOrientationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PelvisOrienRepo extends JpaRepository<IPelvisOrientationModel, String> {
}
