import java.util.Arrays;

public class PositiveString8 {

	public static void main(String[] args) {

		String str = "adghimz";
		if (isAlphabaticOrder(str)) {
			System.out.println("String is in alphabetical order and the string is" + str);
		} else {
			System.out.println("String is not in alphabetical order");
		}
	}

	static boolean isAlphabaticOrder(String str) {
		int n = str.length();
		char[] chArray = new char[n];
		for (int j = 0; j < n; j++) {
			chArray[j] = str.charAt(j);
		}

		Arrays.sort(chArray);
		for (int k = 0; k < n; k++) {
			if (chArray[k] != str.charAt(k)) {

				return false;
			}
		}
		return true;
	}
}

