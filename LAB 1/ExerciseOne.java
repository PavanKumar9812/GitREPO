import java.util.*;
class ExerciseOne
{
   static int SumofCubes(int a)
   {
     
     
      int cube=0;
      int num=0;
       while( a>0 )
	{
	      num= a % 10;
	      cube= cube+ (int)(Math.pow(num,3));
               a= a/10;
            
             
         }
         return cube;
    }
    public static void main(String[] args)
	{
          Scanner sc= new Scanner(System.in);
          int b=0;
          System.out.println("Enter a number");
          b=sc.nextInt();

         int res= SumofCubes(b);
		System.out.println(res);
	}
}