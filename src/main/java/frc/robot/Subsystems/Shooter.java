// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;
import frc.robot.Constants.ShooterConstants;

public class Shooter extends SubsystemBase {
  CANSparkMax launchMotor;
  CANSparkMax feederMotor;
  CANSparkMax rollerMotor;
  /** Creates a new Shooter. */
  public Shooter() {
    launchMotor = new CANSparkMax(ShooterConstants.LAUNCH_MOTOR_ID, MotorType.kBrushed);
    feederMotor = new CANSparkMax(ShooterConstants.FEEDER_MOTOR_ID, MotorType.kBrushed);
    rollerMotor = new CANSparkMax(ShooterConstants.ROLLER_MOTOR_ID, MotorType.kBrushed);

    feederMotor.setIdleMode(IdleMode.kCoast);
    launchMotor.setIdleMode(IdleMode.kBrake);
    rollerMotor.setIdleMode(IdleMode.kBrake);

    feederMotor.setSmartCurrentLimit(DriveConstants.CURRENT_LIMIT);
    launchMotor.setSmartCurrentLimit(DriveConstants.CURRENT_LIMIT);
    rollerMotor.setSmartCurrentLimit(DriveConstants.CURRENT_LIMIT);


    feederMotor.setInverted(true);
    launchMotor.setInverted(true);
  }

  public void shoot(double shootSpeed){
    launchMotor.set(shootSpeed);
  }

  public void feed(double feedSpeed){
    launchMotor.set(feedSpeed);
  }


  public void intake(){
    launchMotor.set(ShooterConstants.LAUNCH_IN_SPEED);
    feederMotor.set(ShooterConstants.FEED_IN_SPEED);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
