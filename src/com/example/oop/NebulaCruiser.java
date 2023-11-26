package com.example.oop;

//This sub-class extends the base class SpaceShip
//It tries to override the method getVelocity but
//it isn't possible because a final keyword is used
//in the method it is trying to override
//Also, this class is a final class and can't be further
//extended because it is a final class
public final class NebulaCruiser extends SpaceShip {

	SpaceShip spaceShip = new SpaceShip();
	int velocity = spaceShip.getVelocity();
	
	public int getVelocity() {
		return this.velocity;
	}
	
}
