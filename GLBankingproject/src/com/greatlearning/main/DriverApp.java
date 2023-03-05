package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Customer;
import com.greatlearning.services.IndianBank;

public class DriverApp {
		public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
			Customer cust=new Customer("18","Virat123");
			IndianBank bank=new IndianBank();
		String a;
		String b;
		
		System.out.println("Welcome to Indian Bank!!");
		System.out.println("Please enter your Cno");
		a=sc.nextLine();
		
		System.out.println("Please enter your Password");
		b=sc.nextLine();
		
		
		if(cust.getAccno().equals(a) && cust.getPassword().equals(b))
		{
			System.out.println("Login Successfull");
			int choice;
			do
			{
				
				System.out.println("1. Deposit");
				System.out.println("2. Withdraw");
				System.out.println("3. Transfer");
				System.out.println("4. Check Balance");
				System.out.println("5. Exit");
				System.out.println("Pls choose your opeation");
				choice =sc.nextInt();
				
				switch(choice)
				{
				case 1: 
						bank.deposit();
						break;
				case 2: 
						bank.withdraw();
						break;	
				case 3: 
					boolean c=bank.transfer();
					if(c)
						System.out.println("Transaction Status Success");
					else
						System.out.println("Transaction Status NotSuccess");
					
					break;
				case 4: 
						double d=bank.checkBal();
						System.out.println("Current Bal is "+d);
						break;
				case 5 :
						System.exit(0);
				default :
						System.out.println("pls enter valid choice");
				}
			}while(choice!=5);
			
		}
		}
}
