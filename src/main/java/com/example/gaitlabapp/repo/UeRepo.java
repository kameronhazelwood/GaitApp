package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.IUeToneModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UeRepo extends JpaRepository<IUeToneModel, String > {
    List<IUeToneModel> findAll();
}
