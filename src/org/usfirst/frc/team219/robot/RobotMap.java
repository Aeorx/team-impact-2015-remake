package org.usfirst.frc.team219.robot;


import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static CANTalon spine;
	public static CANTalon frontLeft;
	public static CANTalon backLeft;
	public static CANTalon frontRight;
	public static CANTalon backRight;
	public static RobotDrive driveTrain;
	
	public static void init()
	{
		spine = new CANTalon(5);
		frontLeft = new CANTalon(1);
		backLeft = new CANTalon(2);
		frontRight = new CANTalon(3);
		backRight = new CANTalon(4);
		driveTrain = new RobotDrive(frontLeft, backLeft, frontRight, backRight);

	}

}
