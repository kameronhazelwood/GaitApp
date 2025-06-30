package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.IAnkleJointMomentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnkleJointMomentRepo extends JpaRepository<IAnkleJointMomentModel, String> {
}
