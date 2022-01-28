// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.*;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final Drive m_drive = new Drive();
  private final Shooter m_shooter = new Shooter();
  private final IntakeIn m_intake = new IntakeIn();
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);


    //Driver gamepad
    final static Joystick drvStick = new Joystick(Constants.drvStick);
    final JoystickButton drA = new JoystickButton(drvStick, Constants.drA);
    final JoystickButton drB = new JoystickButton(drvStick, Constants.drB);
    final JoystickButton drY = new JoystickButton(drvStick, Constants.drY);
    final JoystickButton drX = new JoystickButton(drvStick, Constants.drX);
    final JoystickButton drLT = new JoystickButton(drvStick, Constants.drY);
    final JoystickButton drRT = new JoystickButton(drvStick, Constants.drX);
    final JoystickButton drLB = new JoystickButton(drvStick, Constants.drLB);
    final JoystickButton drRB = new JoystickButton(drvStick, Constants.drRB);
    // Operator gamepad
    final static Joystick opStick = new Joystick(Constants.opStick);
    final JoystickButton op1 = new JoystickButton(opStick, Constants.op1);
    final JoystickButton op2 = new JoystickButton(opStick, Constants.op2);
    final JoystickButton op3 = new JoystickButton(opStick, Constants.op3);
    final JoystickButton op4 = new JoystickButton(opStick, Constants.op4);
    final JoystickButton op5 = new JoystickButton(opStick, Constants.op5);
    final JoystickButton op6 = new JoystickButton(opStick, Constants.op6);
    final JoystickButton op7 = new JoystickButton(opStick, Constants.op7);
    final JoystickButton op8 = new JoystickButton(opStick, Constants.op8);
    final JoystickButton op9 = new JoystickButton(opStick, Constants.op9);
    final JoystickButton op10 = new JoystickButton(opStick, Constants.op10);
    final JoystickButton op11 = new JoystickButton(opStick, Constants.op11);
    final JoystickButton op12 = new JoystickButton(opStick, Constants.op12);
    final JoystickButton op13 = new JoystickButton(opStick, Constants.op13);
    final JoystickButton op14 = new JoystickButton(opStick, Constants.op14);
    final JoystickButton op15 = new JoystickButton(opStick, Constants.op15);
    final JoystickButton op16 = new JoystickButton(opStick, Constants.op16);
    final JoystickButton op17 = new JoystickButton(opStick, Constants.op17);
    final JoystickButton op18 = new JoystickButton(opStick, Constants.op18);
    final JoystickButton op19 = new JoystickButton(opStick, Constants.op19);
    final JoystickButton op20 = new JoystickButton(opStick, Constants.op20);
    final JoystickButton op21 = new JoystickButton(opStick, Constants.op21);
    final JoystickButton op22 = new JoystickButton(opStick, Constants.op22);
    final JoystickButton op23 = new JoystickButton(opStick, Constants.op23);
    final JoystickButton op24 = new JoystickButton(opStick, Constants.op24);
    final JoystickButton op25 = new JoystickButton(opStick, Constants.op25);
    final JoystickButton op26 = new JoystickButton(opStick, Constants.op26);
    final JoystickButton op27 = new JoystickButton(opStick, Constants.op27);
    final JoystickButton op28 = new JoystickButton(opStick, Constants.op28);
  
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    m_drive.setDefaultCommand(JoystickDrive);
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {}

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}
