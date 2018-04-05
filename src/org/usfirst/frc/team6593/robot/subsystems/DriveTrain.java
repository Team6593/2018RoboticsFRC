package org.usfirst.frc.team6593.robot.subsystems;

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
	
	private final SpeedController rightSC = RobotMap.driveTrainrightSC;
	private final SpeedController leftSC = RobotMap.driveTrainleftSC;
	private final DifferentialDrive _drive = RobotMap.drive;
	public static ADXRS450_Gyro gyro = RobotMap.Gyro;
	private static final double kP = 0.03;
	
	
	/*public void setSpeed(double speed_L, double speed_R){//two input speed control
	   	leftSC.set(-speed_L);
	   	rightSC.set(speed_R);
   	}*/

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
		_arcadeDrive(-joy.getY(), joy.getZ());
	}
    
    public void straightDrive(double s) {
    	//arcadeDrive(s);
    }
    
    public void gyroRotate(double speed, double speeds) {
	            _drive.tankDrive(speed, -speeds);
	}
	
    
    public void gyroTeleop(Joystick joystick){
		gyro.reset();
		double angle = gyro.getAngle();
		_drive.tankDrive(joystick.getY(), -angle*kP/*turningValue*/);
		Timer.delay(0.004);
		
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
	   	setSpeed(speed, speed + .02);
   	}
}

