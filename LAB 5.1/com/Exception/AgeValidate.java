// Validate the age of a person and display proper message by using user defined exception. Age of a person should be above 15


package com.Exception;

public class AgeValidate 
{
	
	public static void main(String[] args) 
	{
		int age=10;
		try
		{
			pAge(age);
		}
		catch(AgeLimitException e)
		{
			System.out.println("Person is Not Eligible");
		}
		
		
	}

	public static void pAge(int age) throws AgeLimitException
	{
		
		if(age<15)
		{
			throw new AgeLimitException();
		}
		else
		{
			System.out.println("Person is Eligible");
		}
		
	}
	

}
