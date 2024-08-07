package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.comparisons.IFlexibilityComparison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlexibilityCompRepo extends JpaRepository<IFlexibilityComparison, String> {
    List<IFlexibilityComparison> findAll();
}
