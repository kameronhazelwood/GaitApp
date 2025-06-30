package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.IArmJointAnglesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArmJointRepo extends JpaRepository<IArmJointAnglesModel, String> {

}
