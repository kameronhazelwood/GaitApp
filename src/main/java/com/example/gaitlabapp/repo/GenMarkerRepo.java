package com.example.gaitlabapp.repo;


import com.example.gaitlabapp.model.forms.IGenMarkInfoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenMarkerRepo extends JpaRepository<IGenMarkInfoModel, String> {
    List<IGenMarkInfoModel> findAll();
}
