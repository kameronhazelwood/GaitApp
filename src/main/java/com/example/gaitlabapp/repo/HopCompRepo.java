package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.comparisons.IHopComparison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HopCompRepo extends JpaRepository<IHopComparison, String> {
    List<IHopComparison> findAll();
}
