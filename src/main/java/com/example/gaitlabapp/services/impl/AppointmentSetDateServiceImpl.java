package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.visits.IAppointmentSetDates;
import com.example.gaitlabapp.repo.AppointmentSetDateRepo;
import com.example.gaitlabapp.services.AppointmentSetDateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AppointmentSetDateServiceImpl implements AppointmentSetDateService {
    private final AppointmentSetDateRepo appointmentSetDateRepo;
    @Override
    public IAppointmentSetDates save(IAppointmentSetDates appointmentSetDates) {
        return null;
    }

    @Override
    public IAppointmentSetDates update(IAppointmentSetDates appointmentSetDates) {
        return null;
    }

    @Override
    public List<IAppointmentSetDates> findAll() {
        return appointmentSetDateRepo.findAll();
    }
}
