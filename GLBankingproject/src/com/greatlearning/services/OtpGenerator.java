package com.greatlearning.services;

public class OtpGenerator {
	
	public int generateOTP()
	{
		return((int)(Math.random()*8000)+1000);	
	}
}
