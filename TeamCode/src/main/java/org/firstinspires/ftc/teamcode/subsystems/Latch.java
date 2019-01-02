package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.CRServo;
import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.hardware.controls.GamepadWrapper;
import org.firstinspires.ftc.teamcode.subsystems.subsystemutils.Subsystem;

public class Latch implements Subsystem {
    private GamepadWrapper manipController;
    private CRServo servo;
    private Telemetry telemetry;

    public Latch(GamepadWrapper manipController, CRServo servo, Telemetry telemetry) {
        this.manipController = manipController;
        this.servo = servo;
        this.telemetry = telemetry;
    }

    @Override
    public void init() {
    }

    @Override
    public void update() {
        double power = manipController.getRightStickX();
        servo.setPower(power);
    }
}
