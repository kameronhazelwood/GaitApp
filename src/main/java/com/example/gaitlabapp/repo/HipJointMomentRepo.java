package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.IHipJointMomentsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HipJointMomentRepo extends JpaRepository<IHipJointMomentsModel, String> {
}
