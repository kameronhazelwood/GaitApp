package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.visits.IAppointmentModel;
import com.example.gaitlabapp.services.AptsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.gaitlabapp.repo.AptsRepo;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AptsServiceImpl implements AptsService {
    @Autowired
    private final AptsRepo apptsRepo;

    public Optional<IAppointmentModel> save(IAppointmentModel iAppointmentModel){ return Optional.of(apptsRepo.save(iAppointmentModel));}
    public Optional<IAppointmentModel> findByAptType(String aptType) { return apptsRepo.findByAptType(aptType);}
    public Optional<IAppointmentModel> findByAptSubType(String aptSubType){ return apptsRepo.findByAptSubType(aptSubType);}
    public List<IAppointmentModel> findAll() {return apptsRepo.findAll();}
    public void delete(Long id){ apptsRepo.deleteById(String.valueOf(id));}
}
