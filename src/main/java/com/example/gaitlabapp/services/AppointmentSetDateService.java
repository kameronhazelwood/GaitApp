package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.visits.IAppointmentSetDates;

import java.util.List;

public interface AppointmentSetDateService {
    IAppointmentSetDates save(IAppointmentSetDates appointmentSetDates);
    IAppointmentSetDates update(IAppointmentSetDates appointmentSetDates);
    List<IAppointmentSetDates> findAll();

}
