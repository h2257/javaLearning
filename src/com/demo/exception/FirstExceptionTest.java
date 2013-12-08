package com.exception;

public class FirstExceptionTest{
	public static void main(String[] args){
		try{
		//next line will show;
		System.out.println("we try to calculate '3/0':");
		int x=0;
		x=3/0;
		//next line won't show;
		System.out.println("we try to calculate for '3/0':");
		}
		catch(ArithmeticException e){
		System.out.println("found error :");
		System.out.println( e.getMessage());
		}
	}
}