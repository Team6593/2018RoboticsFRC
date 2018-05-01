 package org.usfirst.frc.team6593.robot.subsystems;


import org.usfirst.frc.team6593.robot.RobotMap;
import org.usfirst.frc.team6593.robot.commands.*;


import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class HoldUp extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private final SpeedController holdUp = RobotMap._holdUp; 

	
	 public void startRolling(double i){
	    	holdUp.set(-i);
	    }
	    
	    public void stopRolling(){
	    	//holdUp.set(0);
	    	holdUp.stopMotor();
	    }
	    
	    public void invertRolling(double i){
	    	holdUp.set(i);
	    }
	    
    public void initDefaultCommand() {
    	
    	//setDefaultCommand(new Lifting());
    	//setDefaultCommand(new ());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

