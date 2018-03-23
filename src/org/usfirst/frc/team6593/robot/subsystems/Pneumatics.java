package org.usfirst.frc.team6593.robot.subsystems;

import org.usfirst.frc.team6593.robot.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Pneumatics extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private final DoubleSolenoid solenoid1 = RobotMap.dsolenoid;
	private final DoubleSolenoid solenoid2 = RobotMap.dsolenoid2;
	private final Compressor compressor = RobotMap.mainCompressor;
	
	public void startSolenoid () {
		solenoid1.set(DoubleSolenoid.Value.kForward);
		
	}
	public void startSolenoid2() {
		solenoid2.set(DoubleSolenoid.Value.kForward);
	}
	public void reverseSolenoid() {
		solenoid1.set(DoubleSolenoid.Value.kReverse);
		
	}
	public void reverseSolenoid2() {
		solenoid2.set(DoubleSolenoid.Value.kReverse);
	}
	
	public void stopSolenoid() {
		solenoid1.set(DoubleSolenoid.Value.kOff);
		
	}
	public void stopSolenoid2() {
		solenoid2.set(DoubleSolenoid.Value.kOff);
	}
	public void startCompressor() {
		compressor.start();
	}
	
	public void stopCompressor() {
		compressor.stop();
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

