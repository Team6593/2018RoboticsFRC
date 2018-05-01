package Autonomous;

import org.usfirst.frc.team6593.robot.Robot;

import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class PickUpLiftTimed extends TimedCommand {

    public PickUpLiftTimed(double timeout) {
        super(timeout);
        // Use requires() here to declare subsystem dependencies
        requires(Robot.pickuplift);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.pickuplift.startRolling(.8);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Called once after timeout
    protected void end() {
    	Robot.pickuplift.stopRolling();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
