import java.util.*;
class Lab3Exercise1
{
   public static void main(String args[])
    {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter integers: ");
            String number=sc.nextLine();
            StringTokenizer token=new StringTokenizer(number);
            int n=0 , sum=0;
            System.out.println("\nEntered integers are : ");
            while(token.hasMoreTokens())
         {
                String s=token.nextToken();
                n=Integer.parseInt(s);
                System.out.print(n+" ");
                sum=sum + n;
          }
        System.out.println();
        System.out.println("Sum is : "+sum);
     }
}