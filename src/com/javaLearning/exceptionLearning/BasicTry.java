package com.javaLearning.exceptionLearning;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
public class BasicTry{
	public static void main(String[] args){
		File file = new File(args[0]); 	
		
		System.out.println(file.isFile());
		int temp;
		try{
			FileReader fileReader = new FileReader(file);
			while((temp = fileReader.read())!=-1){
				System.out.print((char)temp);
			}
		}catch(FileNotFoundException e){
			System.err.println("in FileNotFoundException");
		}catch(IOException e){
			System.err.println("in IOException");
		}finally{
		
		}
	}
}