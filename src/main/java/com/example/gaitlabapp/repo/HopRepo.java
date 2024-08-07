package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.IHopModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HopRepo extends JpaRepository<IHopModel, String> {
    List<IHopModel> findAll();
}
