package Autonomous;

import org.usfirst.frc.team6593.robot.Robot;

import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class ClampTimed extends TimedCommand {

    public ClampTimed(double timeout) {
        super(timeout);
        // Use requires() here to declare subsystem dependencies
        requires(Robot.grab);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.grab.startSolenoid();
    }

    // Called once after timeout
    protected void end() {
    	Robot.grab.stopSolenoid();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
