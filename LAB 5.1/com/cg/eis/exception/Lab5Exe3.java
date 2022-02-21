package com.cg.eis.exception;



public class Lab5Exe3
{
	public static void main(String[] args)
	{
		String firstName="Hello";
		String lastName="World";
		String fullName=firstName.concat(lastName);
		if(firstName=="" && lastName=="")
		{
		     System.out.println(fullName);
		}
	try 
		{
			empName( firstName, lastName);
		}
	        catch(NameValidateException e)
		{
			System.out.println("FIRSTNAME AND LASTNAME SHOULD NOT BE EMPTY");
		}
		
	}

	public static void empName(String firstName,String lastName) throws NameValidateException
	{
		
		if(firstName=="" || lastName=="") {
			 throw new NameValidateException();}
		else
		{
			System.out.println("FIRSTNAME AND LASTNAME Filled Succesfully");
		}
		
	}
	

	

}
