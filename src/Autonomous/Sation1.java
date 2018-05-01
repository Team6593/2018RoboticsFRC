package Autonomous;

import org.usfirst.frc.team6593.robot.Robot;
import org.usfirst.frc.team6593.robot.commands.InvertHoldUp;
import org.usfirst.frc.team6593.robot.commands.PickUpLift;
import org.usfirst.frc.team6593.robot.commands.solenoidOn;
import org.usfirst.frc.team6593.robot.commands.solenoidOn2;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Sation1 extends CommandGroup {

    public Sation1() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	//addSequential(new solenoidOn());
    	
    	//addParallel(new AutoDriveFastForward(4));
    	//addSequential(new InvertHoldUp());
    	//addSequential(new AutoRotate(4));
    	
    	addSequential(new AutoDriveFastForward(3.5));
    	addSequential(new ExtendPistonTimed(1.5));
    	addSequential(new ClampTimed(1.5));
    	addParallel(new AutoDriveBack(2));
    	addSequential(new PickUpLiftTimed(3.5));
    	addSequential(new AutoRotate(5));
    	
    	
    	requires(Robot.drivetrain);
    	requires(Robot.lifting);
    	requires(Robot.grab);
    	requires(Robot.climbing);
    	requires(Robot.holdUp);
    	requires(Robot.pickuplift);
    }
}
