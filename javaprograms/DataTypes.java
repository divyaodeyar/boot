package javacore.basic;

public class DataTypes {

	public static void main(String[] args) {
		
		//Data types 
		// Primitive Types 
		// 1. Number Types - byte, short, int, long
		byte a = 127; //1 byte
		short b = 32_767; //2 byte
		int c = 2147483647; // 4 byte
		long d = 9_223_372_036_854_775_807L; // 8 byte
		
		
		
		
		
		// 2. Floating Types - float, double - point outside numbers
		float e =(float)1.123456789;  // 4 byte (6 to 7 digit precision)
		double f = 1.12345678901234567; // 8 byte (15 to 16 digit precision)
		// 3. Char Types  - char
		char g = '@'; //2 byte
		
		
		// 4. Boolean Types  - boolean
		boolean h = true;
		
		
		// Non-Primitive or Reference Type 
		// String,array, object etc...
		String name = "Divya123@gmail.com"; // string litral
		String name1 = new String("Divya@123gmail.com"); // string object
		
		String[] fruits = new String[] {"apple, banana"};
 
		// Display Output:
		System.out.println("Byte Representing: " + a);
		System.out.println("Short Representing: " + b);
		System.out.println("Int Representing: " + c);
		System.out.println("Long Representing: " + d);
		
		System.out.println("float Representing: " + e);
		System.out.println("double Representing: " + f);
		
		System.out.println("Char Representing: " + g);
		System.out.println("boolean Representing: " + h);
		
		System.out.println("String Representing: " + name.toUpperCase());
		System.out.println("String Representing: " + name1.toLowerCase());
		
		System.out.println("String Representing: " + array[0]);
		
		
		
		
	}
	}


