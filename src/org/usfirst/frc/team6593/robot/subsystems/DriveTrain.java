package org.usfirst.frc.team6593.robot.subsystems;

import org.usfirst.frc.team6593.robot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class DriveTrain extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private final SpeedController rightSC = RobotMap.driveTrainrightSC;
	private final SpeedController leftSC = RobotMap.driveTrainleftSC;
	private final DifferentialDrive drive = RobotMap.drive;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    }
    
    public void tankDrive(double s) {
    	drive.tankDrive(s, s);
    }
             
    public void arcadeDrive(double s) {
    	drive.arcadeDrive(s, 0);
    }
    
    public void straightDrive(double s) {
    	arcadeDrive(s);
    }
    
    public void stopDrive() {
    	drive.stopMotor();
    }
    
	public void roateDrive(double rot){
		
		drive.arcadeDrive(0, rot);
	}
}

