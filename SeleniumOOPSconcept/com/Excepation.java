package session.com;

public class Excepation {
	static void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("Acess Degied -Age must be alatest 18 years");

		} else {
			System.out.println("Access Granted");
		}
	}

	public static void main(String[] args) {
		try {
		checkAge(14);
		
		}catch(ArithmeticException e)
		{
		
		}
		System.out.println("Rest Of Code");
	}

}
