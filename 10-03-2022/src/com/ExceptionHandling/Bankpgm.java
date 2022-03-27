package com.ExceptionHandling;

import java.util.Scanner;

class BankException extends Exception{
	public BankException(String s) {
		super(s);
		
	}
}
class SBIBank{
	int bankbalance;
	public SBIBank() {
		bankbalance=30000;
		
	}
	void withdraw(int withdrawamt) {
		try {
			if(withdrawamt>bankbalance) {
				throw new BankException("Insufficient Balance");
				
			}
			else {
				bankbalance=bankbalance-withdrawamt;
				System.out.println("Balance amount="+bankbalance);
				
			}
			
		}catch(BankException e) {
			e.printStackTrace();
		}
	}
}

public class Bankpgm {

	public static void main(String[] args) {
		SBIBank sob=new SBIBank();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to withdraw");
		int amt=sc.nextInt();
		sob.withdraw(amt);
		

	}

}
