package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.IRecomSurgicalModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecomSurgicalRepo extends JpaRepository<IRecomSurgicalModel, String> {
}
