package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.videoAssessment.ITrunkClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrunkRepo extends JpaRepository<ITrunkClass, String> {
    List<ITrunkClass> findAll();
}
