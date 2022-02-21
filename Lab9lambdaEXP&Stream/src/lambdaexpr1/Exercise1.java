package lambdaexpr1;

public class Exercise1 {

	@FunctionalInterface
	interface Int1
	{
		float numb(double d, double y);
	}

	public static class Power {

		Int1 numb = (x, y) -> 
		{
			return (float) (Math.pow(x, y));
		};

		public static void main(String[] args) 
		{
			Int1 j = (x, y) ->
			{
				return (float) (Math.pow(x, y));
			};
			System.out.println(j.numb(2.5, 5.5));
		}
	}

}
