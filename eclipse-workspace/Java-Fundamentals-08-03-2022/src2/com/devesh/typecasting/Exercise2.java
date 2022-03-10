package com.devesh.typecasting;

import java.util.Scanner;

public class Exercise2 {

		public static void main(String[] args) {
			
			// TODO :: WAP for data converting from  double & long  -> int short byte and float.
			// hint : collect double and long from user console.
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a Double number");
			double number=sc.nextDouble();
			
			int intNumber=(int)number;
			float floatNumber=(float)number;
			byte byteNumber=(byte)number;
			short shortNumber=(short)number;
			
			System.out.println("double converted to int - "+intNumber);
			System.out.println("double converted to short - "+shortNumber);
			System.out.println("double converted to float - "+floatNumber);
			System.out.println("double converted to byte - "+byteNumber);
			
			System.out.println("Enter a Long number");
			long Longnumber=sc.nextLong();
			
			int intNumber2=(int)Longnumber;
			float floatNumber2=Longnumber;
			byte byteNumber2=(byte)Longnumber;
			short shortNumber2=(short)Longnumber;
			
			System.out.println("Long converted to int - "+intNumber2);
			System.out.println("Long converted to short - "+shortNumber2);
			System.out.println("Long converted to float - "+floatNumber2);
			System.out.println("Long converted to byte - "+byteNumber2);
			
			
		}
	}
