package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.visits.IAppointmentModel;

import java.util.List;
import java.util.Optional;

public interface AptsService {
    Optional<IAppointmentModel> save(IAppointmentModel appointmentModel);
    Optional<IAppointmentModel> findByAptType(String aptType);
    Optional<IAppointmentModel> findByAptSubType(String aptSubType);
    List<IAppointmentModel> findAll();
    void delete(Long id);
}
