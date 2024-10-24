// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

public final class Constants {
    public static class ControlConstants{
        public static final double AXIS_THRESHOLD = 0.05;
        public static final double SPIN_SENSITIVITY = 0.8;
        public static final int XBOX_CONTROLLER_DRIVER = 0;
        public static final int XBOX_CONTROLLER_OPERATOR = 1;
        public static final double CONTROLLER_SENSITIVITY = 0.05;
        
        }
    public static class DriveConstants{
        public static final int LEFT_DRIVE1_ID = 1;
        public static final int LEFT_DRIVE2_ID = 2;
        public static final int Right_DRIVE1_ID = 3;
        public static final int Right_DRIVE2_ID = 4;
        public static final int CURRENT_LIMIT = 60;
        public static final double PRECISION_PERCENT = 0.3;
    }
    public static class ShooterConstants{
        public static final int LAUNCH_MOTOR_ID = 6;
        public static final int FEEDER_MOTOR_ID = 5;
        public static final int ROLLER_MOTOR_ID = 8;

        public static final double FEED_IN_SPEED = -0.4;
        public static final double FEED_AMP_SPEED = 0.4;
        public static final double FEED_OUT_SPEED = 1;
        public static final double LAUNCH_SPEED = 1;
        public static final double LAUNCH_AMP_SPEED = 0.17;
        public static final double LAUNCH_IN_SPEED = -1;

    }

    public static class MotionConstants{
        //  Power Percentages
        public static final int FULL_POWER_PERCENT = 1;
        public static final int NO_POWER_PERCENT = 0;
        public static final int NEGATIVE_POWER = -1;
    }

    public static class ClimberConstants {
        //IDs of climber CANSparkMax motors
        public static final int LEFTCLIMBER_ID = 10;
        public static final int RIGHTCLIMBER_ID = 9;

        // Encoder ranges
        public static final int climberEncoderMax = 25;
        public static final int climberEncoderMin = 0;

        // Climb motor speed
        public static final double climberUpSpeed = 1;
        public static final double climberDownSpeed = -1;
        public static final double CONTROLLER_DEADZONE = .05;

    }
    }
