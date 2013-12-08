package com.javaLearning.boxingLearning;

public class AutoUnboxing{
	public static void print(int a){
		System.out.println(a);
	}
	/**
	*	It demo the processing of auto unboxing(Integer -> int)
	*/
	public static void main(String[] args){
		Integer a = 1;
		print(new Integer(1));
	}
}