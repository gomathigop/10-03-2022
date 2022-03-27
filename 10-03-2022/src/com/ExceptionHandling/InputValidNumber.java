package com.ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidNumber {

 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int num;
  
  for(;;) {
   System.out.println("Enter valid number");
   try {
   num=Integer.parseInt(sc.next());
     break;
   
   }catch(NumberFormatException e) {
    e.printStackTrace();
   }catch(InputMismatchException e) {
    e.printStackTrace();
   }
   System.out.println("Please valid integer only");
   }
  
  System.out.println("Input is valid");
 }
}
