package commands;

import annotations.InjectArgs;
import core.ManagementSystem;
import models.centers.EmergencyCenter;
import models.centers.MedicalServiceCenter;


public class RegisterMedicalServiceCenterCommand extends BaseCommand {

    @InjectArgs
    private String[] params;
    private EmergencyCenter emergencyCenter;

    public RegisterMedicalServiceCenterCommand(ManagementSystem managementSystem) {
        super(managementSystem);
    }

    @Override
    public String execute() {
        String name = this.params[1];
        Integer amountOfEmergencies = Integer.valueOf(this.params[2]);

        this.emergencyCenter = new MedicalServiceCenter(name, amountOfEmergencies);
        return super.getManagementSystem().registerMedicalServiceCenter(this.emergencyCenter);
    }
}
