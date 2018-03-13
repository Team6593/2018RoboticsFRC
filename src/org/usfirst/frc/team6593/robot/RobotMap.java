/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/



package org.usfirst.frc.team6593.robot;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	

	
 
    
    public static ADXRS450_Gyro Gyro;

	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	//public void init() {
		
	
	// drivetrain controllers
    public static SpeedController driveTrainrightSC = new Spark(0);
    public static SpeedController driveTrainleftSC = new Spark(1);
    
    // controller for components
    public static SpeedController pickUpMech = new Spark(2);
    public static SpeedController liftingMech = new Spark(3);
	public static SpeedController climbingMech = new Spark(4);
	
	//solenoid stuff
	public static DoubleSolenoid dsolenoid = new DoubleSolenoid(4,5); 
	public static DoubleSolenoid dsolenoid2 = new DoubleSolenoid(6,7);
	public static Compressor mainCompressor = new Compressor(0);
	
	// robotdrive
		public static DifferentialDrive drive = new DifferentialDrive(driveTrainleftSC, driveTrainrightSC );
	//}
	
	
}
