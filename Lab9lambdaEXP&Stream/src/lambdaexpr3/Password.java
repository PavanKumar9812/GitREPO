package lambdaexpr3;

public class Password {

	public static void main(String[] args) {

		String name = "CAPGEMINI";
		String pass = "super123";
		VerifyPassword p = ((username, password) -> {
			if (username.equals(name) && password.equals(pass))
				return true;
			else
				return false;
		});
		System.out.println(p.verify("CAPGEMINI", "super1234"));
	}
}


