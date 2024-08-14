package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.visits.IAppointmentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AptsRepo extends JpaRepository<IAppointmentModel, String> {

    Optional<IAppointmentModel> findByVisitType(String visitType);
    Optional<IAppointmentModel> findByVisitSubType(String visitSubType);
    IAppointmentModel findByMrn(String mrn);
}
