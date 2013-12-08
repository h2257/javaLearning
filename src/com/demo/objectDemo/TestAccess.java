package com.demo.objectDemo;
import com.test.Calculate;
public class TestAccess{
	public static void main(String[] args){
		Calculate a = new Calculate(5);
		System.out.println( "public member function length():"
							+a.length());
		//next line is wrong because "radius has private access	"	
		//System.out.println( "private field radius :" +a.radius);
		//you can get private fields by member function
	}
}	