package com.ExceptionHandling;

import java.util.Scanner;

public class NullpointerException {

	public static void main(String[] args) {
		String n=null;
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter name");
			n=sc.nextLine();
			System.out.println("Name="+n);
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
			
		
		

	}

}
