package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.visits.IAppointmentModel;

import java.util.List;
import java.util.Optional;

public interface AptsService {
    Optional<IAppointmentModel> save(IAppointmentModel appointmentModel);
    Optional<IAppointmentModel> findByVisitType(String visitType);
    Optional<IAppointmentModel> findByVisitSubType(String visitSubType);
    IAppointmentModel findByPatientId(Integer patientId);
    List<IAppointmentModel> findAll();
    void delete(Long id);
}
