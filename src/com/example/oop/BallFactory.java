package com.example.oop;

public class BallFactory {

	public static Ball getBall(String s) {
		
		if(s.equalsIgnoreCase("BaseBall"))
			return new BaseBallBall();
		
		if(s.equalsIgnoreCase("SoftBall"))
			return new SoftBall();
		
		return null;
		
	}
	
	
}
