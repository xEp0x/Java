package commands;

import annotations.InjectArgs;
import core.ManagementSystem;
import models.centers.EmergencyCenter;
import models.centers.FiremanServiceCenter;


public class RegisterFireServiceCenterCommand extends BaseCommand {

    @InjectArgs
    private String[] params;
    private EmergencyCenter emergencyCenter;

    public RegisterFireServiceCenterCommand(ManagementSystem managementSystem) {
        super(managementSystem);
    }

    @Override
    public String execute() {
        String name = this.params[1];
        Integer amountOfEmergencies = Integer.valueOf(this.params[2]);

        this.emergencyCenter = new FiremanServiceCenter(name, amountOfEmergencies);
        return super.getManagementSystem().registerFireServiceCenter(this.emergencyCenter);
    }
}
