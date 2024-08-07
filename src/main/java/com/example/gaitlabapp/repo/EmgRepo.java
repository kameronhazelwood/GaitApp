package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.IEMGModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmgRepo extends JpaRepository<IEMGModel, String> {
    List<IEMGModel> findAll();

}
