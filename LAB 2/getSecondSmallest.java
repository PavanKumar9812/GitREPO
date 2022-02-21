import java.util.Scanner;
class Exercise1
{
 static int getSecondSmallest(int[] a)
 {
    int temp;
   for (int i=0;i<a.length-1; i++)
      {
          for (int j=i+1; j< total; j++)
	    { 
		if (a[i] > a[j])
		{
                 temp = a[i];
		a[i] = a[j];
		a[j] = temp;
                 }
             }
         }
     return a[1];
}
	public static void main(String[] args)
	{
         
          System.out.println("enter the number of elements");
	  n= scan.nextInt(System.in); 
          int[] a= new int[n];
          for (int i=0;i<n; i++)
	   {
         System.out.println("Second smallest"+ getSecondSmallest(a,n));
	}
}