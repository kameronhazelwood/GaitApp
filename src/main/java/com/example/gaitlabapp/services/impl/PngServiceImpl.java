package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.patients.IPngModel;
import com.example.gaitlabapp.repo.PngRepo;
import com.example.gaitlabapp.services.PngService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PngServiceImpl implements PngService {
    private final PngRepo pngRepo;
    @Override
    public IPngModel save(IPngModel pngModel) {
        return pngRepo.save(pngModel);
    }

    @Override
    public IPngModel update(IPngModel pngModel) {
        return pngRepo.save(pngModel);
    }

    @Override
    public List<IPngModel> findAll() {
        return pngRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        pngRepo.deleteById(String.valueOf(id));
    }
}
