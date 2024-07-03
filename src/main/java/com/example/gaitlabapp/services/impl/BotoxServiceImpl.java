package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.patients.IBotoxModel;
import com.example.gaitlabapp.repo.BotoxRepo;
import com.example.gaitlabapp.services.BotoxService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BotoxServiceImpl implements BotoxService {

    private final BotoxRepo botoxRepo;
    @Override
    public Optional<IBotoxModel> save(IBotoxModel botoxModel) {
        return Optional.of(botoxRepo.save(botoxModel));
    }

    @Override
    public Optional<IBotoxModel> findById(String botoxId) {
        return botoxRepo.findById(botoxId);
    }

//    @Override
//    public Optional<IBotoxModel> findbyDate(String botoxDate) {
//        return botoxRepo.findByDate(botoxDate);
//    }

    @Override
    public List<IBotoxModel> findAll() {
       return botoxRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        botoxRepo.deleteById(String.valueOf(id));
    }
}
