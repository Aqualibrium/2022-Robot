// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Shooter extends SubsystemBase {
  TalonSRX lShoot = new TalonSRX(Constants.shootL);
  TalonSRX rShoot = new TalonSRX(Constants.shootR);

  /** Creates a new system to drive the shooter */
  public Shooter() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void runShoot(double speed){
    lShoot.set(ControlMode.PercentOutput, 0.5);
    rShoot.set(ControlMode.PercentOutput, 0.5);
  }

  public void stopShoot(){
    lShoot.set(ControlMode.PercentOutput, 0.0);
    rShoot.set(ControlMode.PercentOutput, 0.0);
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
