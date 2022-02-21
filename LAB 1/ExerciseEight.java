import java.util.Scanner;
class ExerciseEight
{
   static boolean checkNumber(int a)
   {
        if (a==0)
            return false;
         while (a!=1)
	{ 
	   if( a % 2 !=0)

	     return false;

	     a= a/2;
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
                   System.out.println(b +" "+" is power of 2");
		}
           else 
                {
                   System.out.println(b +" "+ "is not a power of 2");
 		}
	}
}