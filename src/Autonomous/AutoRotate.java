package Autonomous;

import org.usfirst.frc.team6593.robot.*;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoRotate extends Command {

    public AutoRotate(double timeout) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drivetrain);

        
            
            setTimeout(timeout);
        }

        // Called just before this Command runs the first time
        protected void initialize() {
        	
        	//Robot.driveTrain.GyroReset();
        }

        // Called repeatedly when this Command is scheduled to run
        protected void execute() {
        	Robot.drivetrain.roateDrive(.4);
        }

        // Make this return true when this Command no longer needs to run execute()
        protected boolean isFinished() {
            return isTimedOut();
        }

        // Called once after isFinished returns true
        protected void end() {
        	Robot.drivetrain.stopDrive();
        }

        // Called when another command which requires one or more of the same
        // subsystems is scheduled to run
        protected void interrupted() {
        }
}
