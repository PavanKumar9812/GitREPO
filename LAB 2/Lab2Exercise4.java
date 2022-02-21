import java.util.*;

class Lab2Exercise4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenght of array");
		int y = sc.nextInt(); 
		int arr [] = new int[y];
		
		for(int i=0;i<y;i++)
		{
		System.out.println("Enter the  array");
		arr[i]=sc.nextInt();
		}

		int result = modifyArray(arr);

		for(int k=0; k<result ;k++){
		System.out.print(arr[k]+" ");
		}
		
	}
	public static int modifyArray(int arr[])
	{
	
		int[] temp = new int[arr.length];
		int j =0;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i] != arr[i+1]){
			temp[j++] = arr[i];	
		}
		}
		temp[j++] = arr[arr.length-1];
	
		for(int k=0;k<j;k++){
		arr[k] = temp[k];
		}
		return j;
	}
	
	
}