// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Subsystems.Shooter;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class AutoSpeakerShot extends SequentialCommandGroup {
  Shooter shooter;
  /** Creates a new AutoSpeakerShot. */
  public AutoSpeakerShot(Shooter m_shooter) {
    shooter = m_shooter;
    addRequirements(shooter);
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(
      new SpeakerShot(shooter), 

      new FeedSpeaker(shooter)
    );
  }
}
