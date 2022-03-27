package com.ExceptionHandling;
import java.util.Scanner;
class CheckAge extends Exception{
 public CheckAge(String s) {
  super(s); 
 }
}

public class MainClass {
	
 public static void main(String[] args) {
  
  int age;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter age");
   age=sc.nextInt();
   try {
   if(age<18) {
    CheckAge ob=new CheckAge("Not eligible for voting");
    throw ob;
  }
   else {
    System.out.println("Eligible for Voting");
   }
   }catch(CheckAge e) {
    e.printStackTrace();
   }
  
 }
}