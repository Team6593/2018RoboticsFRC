package org.usfirst.frc.team6593.robot.subsystems;

import org.usfirst.frc.team6593.robot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ClimbingLift extends Subsystem {

	
	private final SpeedController climbMech = RobotMap.climbingMech; 

	
	 public void startRolling(double i){
	    		climbMech.set(i);
	    }
	    
	    public void stopRolling(){
	    	climbMech.set(0);
	    }
	    
	    public void invertRolling(double i){
	    	climbMech.set(i);
	    }
	    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

