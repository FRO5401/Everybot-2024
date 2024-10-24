// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Commands.AmpShot;
import frc.robot.Commands.AutoSpeakerShot;
import frc.robot.Commands.ClimberMove;
import frc.robot.Commands.FeedAmp;
import frc.robot.Commands.FeedSpeaker;
import frc.robot.Commands.IntakeNote;
import frc.robot.Commands.SpeakerShot;
import frc.robot.Commands.StopAll;
import frc.robot.Commands.XboxMove;
import frc.robot.Subsystems.Climber;
import frc.robot.Subsystems.Drivebase;
import frc.robot.Subsystems.Shooter;

public class RobotContainer {
  CommandXboxController driver = Controls.driver;
  CommandXboxController operator = Controls.operator;

  Shooter shooter = new Shooter();
  Drivebase drivebase = new Drivebase();

  private final SendableChooser<Command> chooser = new SendableChooser<>();

  private final Climber climber = new Climber(7, false, "center", 0);
  public RobotContainer() {
    drivebase.setDefaultCommand(new XboxMove(drivebase));
    climber.setDefaultCommand(new ClimberMove(climber, "center"));
    configureBindings();
  }

  private void configureBindings() {
    operator.leftBumper().whileTrue(new IntakeNote(shooter));
    operator.rightBumper().whileTrue(new SpeakerShot(shooter));
    operator.rightTrigger().onTrue(new FeedSpeaker(shooter));
    operator.b().whileTrue(new AmpShot(shooter));
    operator.a().whileTrue(new FeedAmp(shooter));
    operator.start().whileTrue(new StopAll(shooter));
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
