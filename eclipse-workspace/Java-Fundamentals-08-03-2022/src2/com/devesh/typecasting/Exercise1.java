package com.devesh.typecasting;
import java.io.*;
import java.util.*;
public class Exercise1 {

	public static void main(String[] args) {
		
		// TODO :: WAP for data converting from int, byte, short  -> float , double & long.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Integer");
		int number=sc.nextInt();
		
		float floatNumber=(float)number;
		double doubleNumber=(double)number;
		long longNumber=(long)number;
		
		System.out.println("Int converted to float - "+floatNumber);
		System.out.println("int converted to double - "+doubleNumber);
		System.out.println("int converted to long - "+longNumber);
		
		System.out.println("Enter a Byte Digit");
		byte numberbyte=sc.nextByte();
		
		float floatNumberbyte=(float)numberbyte;
		double doubleNumberbyte=(double)numberbyte;
		long longNumberbyte=(long)numberbyte;
		
		System.out.println("Byte converted to float - "+floatNumberbyte);
		System.out.println("Byte converted to double - "+doubleNumberbyte);
		System.out.println("Byte converted to long - "+longNumberbyte);
		
		System.out.println("Enter a Short Digit");
		short numberShort=sc.nextByte();
		
		float floatNumberShort=(float)numberShort;
		double doubleNumberShort=(double)numberShort;
		long longNumberShort=(long)numberShort;
		
		System.out.println("Short converted to float - "+floatNumberShort);
		System.out.println("Short converted to double - "+doubleNumberShort);
		System.out.println("Short converted to long - "+longNumberShort);
		
		
		
	}
}