package com.example.oop;

//This class is created to demonstrate that the interfaces can be extended
//The interface playable ball extends two other interfaces namely, "throwableball and kickable ball"

public interface PlayableBall extends ThrowableBall, KickableBall {

	void dropBall();
	
}
