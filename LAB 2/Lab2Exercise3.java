import java.util.*;
class Lab2Exercise3
{
    public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int x = sc.nextInt(); 
		int arr [] = new int[ x ];
		
		for(int i = 0; i  <x ; i++)
		{
		         System.out.println("Enter the  array");
		         arr[i]=sc.nextInt();
		}

		int[] a = getSorted(arr);
		for(int i=0;i<a.length;i++)
		{
		        System.out.println(a[i]);
		}
	}
		public static int[] getSorted(int[] arr)
	{
		int[] rev=new int[arr.length];
		int j=0;
		for (int i=arr.length-1; i>=0; i--) 
		{
			rev[j]=arr[i];	
			j++;
		}
		return rev;
	}
}