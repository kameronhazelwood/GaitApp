package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.IKneeJointAnglesModel;
import com.example.gaitlabapp.model.forms.IKneeMomentsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KneeJointRepo extends JpaRepository<IKneeJointAnglesModel, String> {

}
