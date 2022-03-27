package com.ExceptionHandling;

import java.util.Scanner;

public class CheckedException {
	public static void main(String[] args) {
		
		  String name;
		  int age;
		  float sal;
		  Scanner sc=new Scanner(System.in);

		  
		  System.out.println("Enter your name");
		  name=sc.nextLine();
		  System.out.println("Enter age");
		  age=sc.nextInt();
		  System.out.println("Enter sal");
		  sal=sc.nextFloat();
		  
		  System.out.println("Details of Employee");
		  System.out.println("Name="+name);
		  System.out.println("Age="+age);
		  System.out.println("sal="+sal);
		  
		  sc.close();

		 
			
			
		}

}
