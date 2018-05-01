package org.usfirst.frc.team6593.robot.subsystems;

import org.usfirst.frc.team1014.robot.util.MiniPID;
import org.usfirst.frc.team6593.robot.RobotMap;
import org.usfirst.frc.team6593.robot.commands.TankDrive;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class DriveTrain extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private final SpeedController rightSC;
	private final SpeedController leftSC;
	private final DifferentialDrive _drive = RobotMap.drive;
	
	private final ADXRS450_Gyro gyro;
	
	private double targetAngle;
	MiniPID miniPID; // need to test it
	double currentAngle;
	
	public DriveTrain() {
		rightSC = RobotMap.rightside;
		leftSC = RobotMap.leftside;
		
		gyro = RobotMap.Gyro;
		
		targetAngle = 0;
		miniPID = new MiniPID(.03, 0, 0);//P I D
		miniPID.setOutputLimits(.5);
	}

	public void resetPID() {
		miniPID.reset();
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new TankDrive());
        
    	
    }
    
    public void tankDrive(double leftSpeed, double rightSpeed) {
    	
    	_drive.tankDrive(leftSpeed, rightSpeed);
    }
             
    public void _arcadeDrive(double j, double r){
		_drive.arcadeDrive(j, r, false);
		
    }
    
    public void _arcadeDrive(Joystick joy) {
		_arcadeDrive(joy.getY() * .45, joy.getZ() * .65);
		
	}
    
    public void straightDrive(double s) {
    	//arcadeDrive(s);
    }
    
    public void gyroRotate(double speed, double speeds) {
	            _drive.tankDrive(speed, -speeds);
	}
	
    
    public void stopDrive() {
    	_drive.stopMotor();
    }
    
	public void roateDrive(double rot){
		
		_drive.tankDrive(0, rot);
	}
	
	public void setSpeed(double speed_L, double speed_R){//two input speed control
	   	leftSC.set(-speed_L);
	   	rightSC.set(speed_R);
	   	
   	}
   
   	public void setSpeed(double speed){//one input speed control
	   	setSpeed(speed, speed);
   	}
}

