package lambdaexpr1;

public class Exercise2FormatString {
    @FunctionalInterface
	interface spacestring {
		public  StringBuffer sr(String str);
	}

	public static class Space {

		public static void main(String[] args) {

			StringBuffer sb = new StringBuffer();
			spacestring obj = (str) -> {
				for (int i = 0; i < str.length(); i++)
				{
					sb.append(str.charAt(i) + " ");
				}
				return sb;
			};
			StringBuffer str2 = obj.sr("CAPGEMINI");
			System.out.println(str2);
		}

	}
}
