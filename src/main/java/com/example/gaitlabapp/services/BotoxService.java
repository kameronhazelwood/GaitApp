package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.patients.IBotoxModel;
import net.fortuna.ical4j.filter.FilterExpression;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface BotoxService {

    Optional<IBotoxModel> save(IBotoxModel botoxModel);
    Optional<IBotoxModel> findById(String botoxId);
//    Optional<IBotoxModel> findbyDate(String botoxDate);
    List<IBotoxModel> findAll();
    void delete(Long id);
}
