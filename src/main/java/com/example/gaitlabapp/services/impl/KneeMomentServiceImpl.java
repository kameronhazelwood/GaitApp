package com.example.gaitlabapp.services.impl;


import com.example.gaitlabapp.model.forms.IKneeJointAnglesModel;
import com.example.gaitlabapp.model.forms.IKneeMomentsModel;
import com.example.gaitlabapp.repo.KneeJointRepo;
import com.example.gaitlabapp.repo.KneeMomentRepo;
import com.example.gaitlabapp.services.KneeMomentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KneeMomentServiceImpl implements KneeMomentService {
   private final KneeMomentRepo kneeMomentRepo;
    @Override
    public IKneeMomentsModel save(IKneeMomentsModel kneeMomentsModel) {
        return null;
    }

    @Override
    public IKneeMomentsModel update(IKneeMomentsModel kneeMomentsModel) {
        return null;
    }

    @Override
    public List<IKneeMomentsModel> findAll() {
        return kneeMomentRepo.findAll();
    }
}
