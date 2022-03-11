package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
  
		Scanner inKey = new Scanner(System.in);
		
		System.out.println("enter a positive integer");  
		int input = inKey.nextInt();
		
		
		System.out.println("enter another positive integer");  
		int input2 = inKey.nextInt();
		
		double num1Pow = Math.pow(input,input2);
		System.out.println(num1Pow + "\n");
		
		
	}
	
	
	
	
	public static void problem02() {
		
		System.out.println("enter a positive integer"); 
		
	}

	
	

	public static void problem03() {
		
		Scanner inKey = new Scanner(System.in);
		
		System.out.println("\n enter the first side of the triangle"); 
		int input3 = inKey.nextInt();
		
		System.out.println("enter the second side of the triangle"); 
		int input4 = inKey.nextInt();
		
		System.out.println();
	}


	
	
	public static void problem04() {
		
	}
	
	
	
	
	
	
}
