package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.IAROMModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AromRepo extends JpaRepository<IAROMModel, String> {
    List<IAROMModel> findAll();
}
