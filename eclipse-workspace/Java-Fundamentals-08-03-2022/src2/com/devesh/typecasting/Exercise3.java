package com.devesh.typecasting;
import java.util.*;
public class Exercise3 {
	public static void main(String args[]) {
		// TODO :: WAP for data converting from  string number  -> int short byte long double and float.
				// hint : collect string (number) from user console.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.next();
		int number=Integer.parseInt(s);
		short shortString=Short.valueOf(s);
		byte byteString=Byte.valueOf(s);
		long longString=Long.parseLong(s);
		double doubleString=Double.parseDouble(s);
		float floatString=Float.parseFloat(s);
		
		System.out.println("String to int Format - "+number);
		System.out.println("String to short Format - "+shortString);
		System.out.println("String to byte Format - "+byteString);
		System.out.println("String to long Format - "+longString);
		System.out.println("String to double Format - "+doubleString);
		System.out.println("String to float Format - "+floatString);
		
	}
}
