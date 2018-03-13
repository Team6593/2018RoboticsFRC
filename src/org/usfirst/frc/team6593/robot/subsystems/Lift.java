 package org.usfirst.frc.team6593.robot.subsystems;


import org.usfirst.frc.team6593.robot.RobotMap;
import org.usfirst.frc.team6593.robot.commands.*;


import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Lift extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private final SpeedController liftMech = RobotMap.liftingMech; 

	
	 public void startRolling(double i){
	    		liftMech.set(i);
	    }
	    
	    public void stopRolling(){
	    	liftMech.set(0);
	    }
	    public void invertRolling(double i){
	    	liftMech.set(i);
	    }
    public void initDefaultCommand() {
    	
    	//setDefaultCommand(new Lifting());
    	//setDefaultCommand(new ());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

