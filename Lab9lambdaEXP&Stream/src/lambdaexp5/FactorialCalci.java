package lambdaexp5;

public class FactorialCalci 
{

	static Fact f1;

	public static  void main(String[] args)
	{
		
		f1 = (n) -> 
		{
			if (n == 0)
				return 1;
			else 
			{
				return n * (f1.multiply(n - 1));
			}
		};
		double k = f1.multiply(120);
		System.out.println(k);
	}

}


