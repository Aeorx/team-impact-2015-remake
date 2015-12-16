package org.usfirst.frc.team219.robot.subsystems;

<<<<<<< HEAD
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
=======
import edu.wpi.first.wpilibj.command.Subsystem;

public class Pneumatics extends Subsystem {

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
>>>>>>> bac1b50907b5d62e3305150e77864e2c31b83839
	}

}
