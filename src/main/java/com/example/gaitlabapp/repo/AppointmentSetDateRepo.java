package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.visits.IAppointmentSetDates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentSetDateRepo extends JpaRepository<IAppointmentSetDates, String> {
}
