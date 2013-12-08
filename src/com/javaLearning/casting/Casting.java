package com.javaLearning.casting;

public class Casting{
	/**
	*	demo how to casting ( object -> parent/interface) 
	*/
	public static void main(String[] args){
		//casting ( object -> parent)
		Animal animal1 = new Human("Joy");
		animal1.die();
		
		//casting to interface
		Flyable flyable = (Human)animal1;
		flyable.fly();
	}
}
	