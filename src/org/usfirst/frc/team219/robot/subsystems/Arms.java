package org.usfirst.frc.team219.robot.subsystems;

import org.usfirst.frc.team219.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class Arms extends Subsystem {

	Solenoid topLeft;
	Solenoid topRight;
	Solenoid bottomLeft;
	Solenoid bottomRight;

	public Arms()	{
		topLeft = RobotMap.topLeft;
		topRight = RobotMap.topRight;
		bottomLeft = RobotMap.bottomLeft;
		bottomRight = RobotMap.bottomRight;
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
