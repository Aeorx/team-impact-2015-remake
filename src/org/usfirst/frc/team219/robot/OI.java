package org.usfirst.frc.team219.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import org.usfirst.frc.team219.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 * OI stands for operator interface
 */
public class OI 
{
	Joystick stick;
	public OI()
	{
		stick = new Joystick(1);
	}
	public Joystick getStick()
	{
		return stick;
	}
}

