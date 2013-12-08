package com.javaLearning.exceptionLearning;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
public class BasicTryWithFinally{
	/**
		show the text file on screen
	*	@param args the first parameter is the relative or absolute path of file, which is you want to show in Standard output stream
		@exception IllegalArgumentException if nothing entered
	*/
	public static void main(String[] args) throws IllegalArgumentException{
			
		if(args.length==0){
			throw new IllegalArgumentException("you must input some file to operate");
		}
		//System.out.println(file.isFile());
		int temp;
		try{
			File file = new File(args[0]); 
			FileReader fileReader = new FileReader(file);
			while((temp = fileReader.read())!=-1){
				System.out.print((char)temp);
			}
		}catch(FileNotFoundException e){
			System.err.println("in FileNotFoundException");
		}catch(IOException e){
			System.err.println("in IOException");
		}finally{
			System.err.println("in finally");
		}
		System.out.println("last one");
	}
}