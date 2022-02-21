import java.util.Scanner;
public class Pipe
{
  public String getImage(String sr)
  { 
	StringBuffer sb = new StringBuffer(sr);	
	sb.append('|');
	StringBuffer sb1 = new StringBuffer(sr);	
	sb1.reverse();
	sb.append(sb1);
	String r = sb.toString();
	return r;
   }

   public static void main(String[] args)
	{
  	 Pipe p= new Pipe();
         String  sr;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a String");
	 sr = sc.next();
	 System.out.println(p.getImage(sr));
	}
}
