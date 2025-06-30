package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.IHipJointModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HipJointRepo extends JpaRepository<IHipJointModel, String> {
}
