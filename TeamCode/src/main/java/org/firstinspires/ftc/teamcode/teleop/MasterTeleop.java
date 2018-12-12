package org.firstinspires.ftc.teamcode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.hardware.controls.GamepadWrapper;
import org.firstinspires.ftc.teamcode.hardware.hardwareutils.HardwareManager;
import org.firstinspires.ftc.teamcode.subsystems.subsystemutils.Subsystem;
import org.firstinspires.ftc.teamcode.subsystems.subsystemutils.SubsystemManager;

@TeleOp
public class MasterTeleop extends OpMode {

    @Override
    public void init_loop() {
        // If you are using Motorola E4 phones,
        // you should send telemetry data while waiting for start.
        telemetry.addData("status", "loop test... waiting for start");
    }
    @Override
    public void init() {

    }
    @Override
    public void loop() {

    }

}
