package Autonomous;

import org.usfirst.frc.team6593.robot.Robot;

import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class ExtendPistonTimed extends TimedCommand {

    public ExtendPistonTimed(double timeout) {
        super(timeout);
        // Use requires() here to declare subsystem dependencies
        requires(Robot.grab);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.grab.startSolenoid2();
    }

    // Called once after timeout
    protected void end() {
    	Robot.grab.stopSolenoid2();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
