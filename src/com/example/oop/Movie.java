package com.example.oop;

public class Movie {

	
	
	public static void main(String[] args) {
		
		Actor actor = new Actor("Arnold", "Sweignsteger");
		System.out.println(actor);
		
		Actor detailedActor = new Actor("Arnold", "Sweignster", true);
		System.out.println(actor);
		
		String actorName = actor.getActorName();
		System.out.println(actorName);
	}
	
}
