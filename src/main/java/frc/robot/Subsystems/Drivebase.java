// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;

public class Drivebase extends SubsystemBase {
  CANSparkMax leftDrive1;
  CANSparkMax leftDrive2;
  CANSparkMax rightDrive1;
  CANSparkMax rightDrive2;
  
  /** Creates a new Drivebase. */
  public Drivebase() {
    leftDrive1 = new CANSparkMax(DriveConstants.LEFT_DRIVE1_ID, MotorType.kBrushed);
    leftDrive2 = new CANSparkMax(DriveConstants.LEFT_DRIVE2_ID, MotorType.kBrushed);
    rightDrive1 = new CANSparkMax(DriveConstants.Right_DRIVE1_ID, MotorType.kBrushed);
    rightDrive2 = new CANSparkMax(DriveConstants.Right_DRIVE2_ID, MotorType.kBrushed);


    //    Inverts left motors direction 
    leftDrive1.setInverted(true);
    leftDrive2.setInverted(true);

    /*  Setting Idle Mode */
    //    Left Drive
    leftDrive1.setIdleMode(IdleMode.kBrake);
    leftDrive2.setIdleMode(IdleMode.kBrake);
    //    Right Drive
    rightDrive1.setIdleMode(IdleMode.kBrake);
    rightDrive2.setIdleMode(IdleMode.kBrake);

    leftDrive2.follow(leftDrive1);
    rightDrive2.follow(rightDrive1);

    leftDrive1.setSmartCurrentLimit(DriveConstants.CURRENT_LIMIT);
    leftDrive2.setSmartCurrentLimit(DriveConstants.CURRENT_LIMIT);
    rightDrive1.setSmartCurrentLimit(DriveConstants.CURRENT_LIMIT);
    rightDrive2.setSmartCurrentLimit(DriveConstants.CURRENT_LIMIT);

  }

  public void move(double left, double right){
    //    Sets speeds of motors
    leftDrive1.set(left);
    rightDrive1.set(right);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
