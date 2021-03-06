/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6593.robot;

import org.usfirst.frc.team6593.robot.commands.Climbing;
import org.usfirst.frc.team6593.robot.commands.DoNothing;
import org.usfirst.frc.team6593.robot.commands.HoldingUp;
import org.usfirst.frc.team6593.robot.commands.InvertClimbing;
import org.usfirst.frc.team6593.robot.commands.InvertHoldUp;
import org.usfirst.frc.team6593.robot.commands.InvertPickUp;

import org.usfirst.frc.team6593.robot.commands.PickUpLift;
import org.usfirst.frc.team6593.robot.commands.SolenoidOff;
import org.usfirst.frc.team6593.robot.commands.SolenoidOff2;
import org.usfirst.frc.team6593.robot.commands.SolenoidReverse;
import org.usfirst.frc.team6593.robot.commands.SolenoidReverse2;
import org.usfirst.frc.team6593.robot.commands.StopClimbing;

import org.usfirst.frc.team6593.robot.commands.StopPickUp;
import org.usfirst.frc.team6593.robot.commands.solenoidOn;
import org.usfirst.frc.team6593.robot.commands.solenoidOn2;
import org.usfirst.frc.team6593.robot.commands.timedInvertRolling;

import Autonomous.AutoDriveBack;
import Autonomous.AutoDriveFastForward;
import Autonomous.Sation1;
import Autonomous.Sation2;
import Autonomous.Sation3;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.AxisType;
import edu.wpi.first.wpilibj.Sendable;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	
	//logitech extreme 3d
	public Joystick joystick = new Joystick(1);
	
	//logitech f310
	public Joystick joystick2 = new Joystick(0);
	
	//logitech f310 button mapping 
	public JoystickButton rightBumper;
	public JoystickButton leftBumper;
	public JoystickButton rightTrigger;
	public JoystickButton leftTrigger;
	public JoystickButton aButton;
	public JoystickButton bButton;
	public JoystickButton yButton;
	public JoystickButton xButton;
	public JoystickButton rightAxisButton;
	public JoystickButton leftAxisButton;
	public JoystickButton backButton;
	public JoystickButton startButton;
	public JoystickButton leftPress;
	public JoystickButton rightPress;
	
	public OI() {
		
		// mapping f310
		rightBumper = new JoystickButton(joystick2, 6);
		rightBumper.whileHeld(new PickUpLift());
		rightBumper.whenReleased(new StopPickUp());
		
		leftBumper = new JoystickButton(joystick2, 5);
		leftBumper.whileHeld(new InvertPickUp());
		leftBumper.whenReleased(new StopPickUp());
		
		rightTrigger = new JoystickButton(joystick2, 8);
		rightTrigger.whileHeld(new Climbing());
		rightTrigger.whenReleased(new StopClimbing());
		
		leftTrigger = new JoystickButton(joystick2, 7);
		leftTrigger.whileHeld(new InvertClimbing());
		leftTrigger.whenReleased(new StopClimbing());
		
		aButton = new JoystickButton(joystick2, 2);
		aButton.whenPressed(new solenoidOn2());
		aButton.whenReleased(new SolenoidOff2());
		
		bButton = new JoystickButton(joystick2, 3);
		bButton.whenPressed(new SolenoidReverse2());
		bButton.whenReleased(new SolenoidOff2());
		
		yButton = new JoystickButton(joystick2, 4);
		yButton.whenPressed(new SolenoidReverse());
		yButton.whenReleased(new SolenoidOff());
		
		xButton = new JoystickButton(joystick2, 1);
		xButton.whenPressed(new solenoidOn());
		xButton.whenReleased(new SolenoidOff());
		
		backButton = new JoystickButton(joystick2, 9);
		backButton.whenPressed(new InvertHoldUp());
		backButton.whenReleased(new DoNothing());
		
		startButton = new JoystickButton(joystick2, 10);
		startButton.whenPressed(new HoldingUp()); // Actually going in other way 
		startButton.whenReleased(new DoNothing());
		
		//leftPress = new JoystickButton(joystick2, 11);
		//leftPress.whenPressed(new HoldingUp());
		//leftPress.whenReleased(new DoNothing());
		
		//rightPress = new JoystickButton(joystick2, 12);
		//rightPress.whenPressed(new LetDown());
		//rightPress.whenReleased(new DoNothing());
		
		rightAxisButton = new JoystickButton(joystick2, 12);
		leftAxisButton = new JoystickButton(joystick2, 11);
		
		
		// putting Autonomous commands in smartdashboard or shuffle.
		SmartDashboard.putData("AutoDrive", new AutoDriveBack(5));
		SmartDashboard.putData("Sation 1", new Sation1());
		SmartDashboard.putData("Sation 2", new Sation2());
		SmartDashboard.putData("Sation 3", new Sation3());
		
		// Putting information for other components and functions. 
		SmartDashboard.getNumber("Joystick Y Value", joystick2.getY());
		SmartDashboard.getNumber("Joystick Z Value", joystick2.getZ());
		
		
		
		
	}
	
	 public double getDriveLeftSpeed() {
	    	return joystick2.getRawAxis(1);
	    }
	    
	    public double getDriveRightSpeed() {
	    	return joystick2.getRawAxis(5);
	    }

	    public Joystick getJoystick2() {
	        return joystick2;
	    }

	
	
}
