import java.util.Scanner;
class ExerciseSeven
{
   static boolean checkNumber(int a)
   {
       while( a>0 )
	{
	    int firstdigit = a%10;
		a= a/10;
	
	    if(firstdigit < a%10 )
               return false;
         }
         return true;
    }
    public static void main(String[] args)
	{
          Scanner sc= new Scanner(System.in);
          int b=0;
          System.out.println("Enter a number");
          b=sc.nextInt();

          if(checkNumber(b))
		{
                   System.out.println("The number is in increasing order");
		}
           else 
                {
                   System.out.println("The number is not in increasing order");
 		}
	}
}