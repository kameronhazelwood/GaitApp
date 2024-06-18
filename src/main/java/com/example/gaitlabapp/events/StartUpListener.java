package com.example.gaitlabapp.events;


import com.example.gaitlabapp.controllers.FxViewController;
import com.example.gaitlabapp.controllers.UserLoginController;
import lombok.NonNull;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class StartUpListener implements ApplicationListener<StartUpEvent> {

    @Override
    public void onApplicationEvent(@NonNull StartUpEvent event) {
        try {
            new UserLoginController(event.getStage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
