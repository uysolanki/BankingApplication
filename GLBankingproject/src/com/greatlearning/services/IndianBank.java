package com.greatlearning.services;

import java.util.Scanner;

public class IndianBank implements BankingServices {

	double balance=1000;
	Scanner sc=new Scanner(System.in);
	@Override
	public void deposit() {
		System.out.println("Enter amount to deposit");
		double amount=sc.nextDouble(); 
		if(amount>0)
			{
			balance=balance+amount;
			System.out.println("Updated Balance is "+balance);
			}
		else
		{
			System.out.println("Please enter +ve Amount");
		}
	}

	@Override
	public boolean withdraw() {
		
		System.out.println("Enter amount to withdraw");
		double amount=sc.nextDouble(); 
		
		if(amount<=checkBal())
		{
			balance=balance-amount;
			System.out.println("Updated Balance is "+balance);
			
			return true;
		}
		else
		{
			System.out.println("Not Suff funds to withdraw");
			return false;
		}
		
		
	}

	@Override
	public double checkBal() {
		return balance;
	}

	@Override
	public boolean transfer() {
		OtpGenerator otp=new OtpGenerator();
		int myotp=otp.generateOTP();
		System.out.println("OTP is "+myotp);
		
		System.out.println("Enter the OTP recieved on SMS");
		int smsotp=sc.nextInt();
		
		if(myotp==smsotp)
		{
			System.out.println("enter amount to be transfered");
			double amount=sc.nextDouble();
			
			if(amount<=checkBal())
			{
				balance=balance-amount;
				System.out.println("Updated Balance is "+balance);
				
				
			}
			return true;
		}
		else
		{
			System.out.println("Authentication Failed");
			return false;
		}
		
	}

}
