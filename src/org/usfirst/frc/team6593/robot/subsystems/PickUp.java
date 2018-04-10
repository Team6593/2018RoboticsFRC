package org.usfirst.frc.team6593.robot.subsystems;

import org.usfirst.frc.team6593.robot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class PickUp extends Subsystem {
	private final SpeedController pickUpMech = RobotMap.pickUpMech;
	
	 public void startRolling(double i){
		 pickUpMech.set(i);
	    }
	    
	    public void stopRolling(){
	    	pickUpMech.set(0);
	    }
	    
	    public void invertRolling(double i){
	    	pickUpMech.set(-i);
	    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

