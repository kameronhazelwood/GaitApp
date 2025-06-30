package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.IGroundReactionForces;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroundReactionRepo extends JpaRepository<IGroundReactionForces, String> {

}
