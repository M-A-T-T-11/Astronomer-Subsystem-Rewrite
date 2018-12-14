package org.firstinspires.ftc.teamcode.subsystems.subsystemutils;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.subsystems.subsystemutils.Subsystem;

public class SubsystemManager {

  private Subsystem[] subSystems;
  private Telemetry telemetry;
  public SubsystemManager(Telemetry telemetry, Subsystem ...subSystems) {
      this.telemetry = telemetry;
      this.subSystems = subSystems;
  }

  public void init() {
    for (Subsystem subSystem : subSystems)  {
      subSystem.init();
    }
  }

  public void update() {
    for (Subsystem subSystem : subSystems)  {
      subSystem.update();
    }
    telemetry.update();
  }
}
