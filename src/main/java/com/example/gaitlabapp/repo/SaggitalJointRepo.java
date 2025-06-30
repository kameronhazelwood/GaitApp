package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.ISaggitalJointModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaggitalJointRepo extends JpaRepository<ISaggitalJointModel, String> {
}
