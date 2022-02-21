package lab8Multithreading;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class CopyDataThread extends Thread
{
	@SuppressWarnings("resource")
	public void run() 
	{
	try 
	{
		int inc=0;
		Scanner scan= new Scanner(System.in);
		FileOutputStream fil = new FileOutputStream("C:\\Users\\91911\\OneDrive\\Desktop\\CAPGEMINI\\LAB BOOK ANS\\source.txt");
		System.out.println("Enter the character");
		String str;
		str=scan.nextLine();
		byte c[]=str.getBytes();
		fil.write(c);
		fil.close();
		System.out.println("Write Sccessful");
		FileInputStream fil1= new FileInputStream("C:\\Users\\91911\\OneDrive\\Desktop\\CAPGEMINI\\LAB BOOK ANS\\source.txt");
		FileOutputStream fil2 = new FileOutputStream("C:\\Users\\91911\\OneDrive\\Desktop\\CAPGEMINI\\LAB BOOK ANS\\Destnation.txt");
		int j;
		while((j=fil1.read())!=-1)
		{
			fil2.write((char)j);
			inc++;
			if(inc==10)
			{
				System.out.println("10 charactres are copied");
				Thread.sleep(5000);
				inc=0;
			}
		}
		
		
		
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}

	}
public static void main(String[] args)
{
	CopyDataThread t=new CopyDataThread();
	t.start();
}
}
