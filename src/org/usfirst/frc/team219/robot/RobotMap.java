package org.usfirst.frc.team219.robot;


import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;

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
	public static DigitalInput spineEncoder;
	
	public static void init()
	{
		spine = new CANTalon(5);
		frontLeft = new CANTalon(2);
		backLeft = new CANTalon(4);
		frontRight = new CANTalon(1);
		backRight = new CANTalon(3);
		frontLeft.reverseOutput(true);
		driveTrain = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
		driveTrain.setInvertedMotor(MotorType.kFrontRight, true);
		driveTrain.setInvertedMotor(MotorType.kRearRight, true);
		spineEncoder = new DigitalInput(0);

	}

}
