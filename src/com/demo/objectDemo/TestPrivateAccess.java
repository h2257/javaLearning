package com.demo.objectDemo;
import com.test.Calculate;
public class TestPrivateAccess extends Calculate{
		public TestPrivateAccess (double r){
			super(r);
		}	
	public static void main(String[] args){
		TestPrivateAccess a = new TestPrivateAccess(5);
		System.out.println( "public member function length():"
							+a.length());
		//next line is wrong because "radius has private access	"			
		//System.out.println( "private field radius :" +a.radius);
		//you can get private fields by member function
	}
	}	