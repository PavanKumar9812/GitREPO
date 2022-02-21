import java.util.Scanner;
class ExerciseSix
{ 
    public static int calculateDiff(int a)
    {
       int sumofSquare=0;
        int sum=0;
	int squareofsum=0;
	
	for(int i=1; i< a;i++)
	{ 	
	   sumofSquare= sumofSquare + (int)Math.pow(i,2);
  
           sum = sum + i;
        }
       squareofsum= sum*sum;
        return sumofSquare - squareofsum;
      }
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in); 
       int a=sc.nextInt();
	int res= calculateDiff(a);
	System.out.println("Difference: "+ res);
      }
}