package org.jusecase.poe.usecases;

import org.jusecase.inject.Component;
import org.jusecase.poe.entities.Settings;
import org.jusecase.poe.gateways.SettingsGateway;

import javax.inject.Inject;

@Component
public class SaveSettings {
    @Inject
    private SettingsGateway settingsGateway;

    public void execute(Settings settings) {
        settingsGateway.saveSettings(settings);
        new ApplySettings().execute();
    }
}
