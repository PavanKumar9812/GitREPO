
 import java.util.*;
class ExerciseFive
{
       
      public static int calculateSum(int x)
	{    
           int sum=0;
            for(int i=0;i<=x;i++)
 		{
                  if (i%3 ==0 || i%5 ==0) 
			
			 sum= sum+i;       
                        
	           }
             return sum;
	  }
   	

	
 public static void main(String[] args)
		{
   		  
   		 Scanner sc = new Scanner(System.in);
                 System.out.println("Enter the Number");
    		
		int a=sc.nextInt();
    		
    	       int  res = calculateSum(a);  
  			
		System.out.println("sum of first n natural numbers divisible by 3 or 5:"+res);
		}
		
}
                


    