package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.IFlexibilityModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlexibilityRepo extends JpaRepository<IFlexibilityModel, String> {
    List<IFlexibilityModel> findAll();
}
