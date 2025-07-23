package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.IOrthoticsRecomModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrthRecomRepo extends JpaRepository<IOrthoticsRecomModel, String> {
}
