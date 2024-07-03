package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.patients.IBotoxModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;

@Repository
public interface BotoxRepo extends JpaRepository<IBotoxModel, String> {
    Optional<IBotoxModel> findById(String botoxId);
//    Optional<IBotoxModel> findByDate(String botoxDate);
}
