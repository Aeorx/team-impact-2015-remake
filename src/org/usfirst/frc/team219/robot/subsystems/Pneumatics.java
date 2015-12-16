package org.usfirst.frc.team219.robot.subsystems;

import org.usfirst.frc.team219.robot.RobotMap;

import edu.wpi.first.wpilibj.Compressor;

public class Pneumatics {
	
	Compressor c;
	boolean enabled;
	boolean pressureSwitch;
	float current;
	
	public Pneumatics()	{
		c = RobotMap.c;
		enabled = c.enabled();
		pressureSwitch = c.getPressureSwitchValue();
		current = c.getCompressorCurrent();
	}
	}

}
