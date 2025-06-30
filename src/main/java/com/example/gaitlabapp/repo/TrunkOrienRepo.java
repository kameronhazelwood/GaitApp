package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.ITrunkOrientationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrunkOrienRepo extends JpaRepository<ITrunkOrientationModel, String> {
}
