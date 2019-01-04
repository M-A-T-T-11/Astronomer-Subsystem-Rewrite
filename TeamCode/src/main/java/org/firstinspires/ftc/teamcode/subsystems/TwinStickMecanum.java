package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import org.firstinspires.ftc.teamcode.hardware.controls.GamepadWrapper;
import org.firstinspires.ftc.teamcode.subsystems.subsystemutils.Subsystem;

public class TwinStickMecanum implements Subsystem{

    private GamepadWrapper driveController;
    private DcMotor leftFrontDrive;
    private DcMotor rightFrontDrive;
    private DcMotor leftRearDrive;
    private DcMotor rightRearDrive;

    public TwinStickMecanum(GamepadWrapper driveController, DcMotor leftFrontDrive, DcMotor rightFrontDrive, DcMotor leftRearDrive, DcMotor rightRearDrive){
        this.driveController = driveController;
        this.leftFrontDrive = leftFrontDrive;
        this.rightFrontDrive = rightFrontDrive;
        this.leftRearDrive = leftRearDrive;
        this.rightRearDrive = rightRearDrive;
    }

    @Override
    public void init(){
    }

    @Override
    public void update() {
        double r = Math.hypot(driveController.getLeftStickX(), driveController.getLeftStickY());
        double robotAngle = Math.atan2(driveController.getLeftStickY(), driveController.getLeftStickX()) - Math.PI / 4;
        double rightX = driveController.getLeftStickX();
        final double frontLeft = r * Math.cos(robotAngle) + rightX;
        final double frontRight = r * Math.sin(robotAngle) - rightX;
        final double rearLeft = r * Math.sin(robotAngle) + rightX;
        final double rearRight = r * Math.cos(robotAngle) - rightX;

        leftFrontDrive.setPower(frontLeft);
        rightFrontDrive.setPower(frontRight);
        leftRearDrive.setPower(rearLeft)
        rightRearDrive.setPower(rearRight);
    }
}
