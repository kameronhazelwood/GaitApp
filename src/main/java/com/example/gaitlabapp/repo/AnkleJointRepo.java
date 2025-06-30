package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.IAnkleJointAnglesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnkleJointRepo extends JpaRepository<IAnkleJointAnglesModel, String> {
}
