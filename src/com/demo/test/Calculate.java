package com.test;
public class Calculate{
	private double radius ;
	public Calculate( double r){
		radius =r ;
	}
	public double length(){
		return 2*Math.PI*radius;
	}
	public static void main( String[] args){
		Calculate C = new Calculate(10);
		System.out.println( C.length());
 	}
}