// Validate the age of a person and display proper message by using user defined exception. Age of a person should be above 15.

package com.exceptions;


import java.util.Scanner;
  
class Lab5Exe1
{
  public static void main(String [] args)
   {
     
     Scanner sc= new Scanner(System.in);
     System.out.println("enter the age of person");
     int age = sc.nextInt();
     try {
       if (age > 15 && age!=0) 
      System.out.println("Person is eligible to work");
     }
 catch (Exception e)
      {
    System.out.println("Person is not eligible to work");
       }
    } 
}