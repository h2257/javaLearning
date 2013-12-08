package com.javaLearning.casting;

public class Human extends Animal implements Flyable{
	
	private String name;
	
	public Human(String name){
		this.name=name;
	}
	@Override
	public void die(){
		System.out.println(name+" die");
	}
	
	@Override
	public void fly(){
		System.out.println(name+" fly");
	}
}
