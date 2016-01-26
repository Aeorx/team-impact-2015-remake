package org.usfirst.frc.team219.robot.subsystems;

import org.usfirst.frc.team219.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class Arms extends Subsystem {

	Solenoid topLeft; //big piston (inner)
	Solenoid topRight;
	Solenoid bottomLeft; //little piston (outer)
	Solenoid bottomRight;
	static boolean reverse = false;

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

	public void cycleArms()	{
		if(!topLeft.get() && !bottomLeft.get())	{
			topLeft.set(true);
			reverse = false;
		}
		else if(topLeft.get() && !bottomLeft.get() && !reverse)
			topLeft.set(true);
		else if(topLeft.get() && bottomLeft.get())	{
			reverse = true;
			bottomLeft.set(true);
		}
		else
			topLeft.set(false);
	}

}
