package brushUps;

public class strings {

	public static void main(String[] args) {

		// Stirng is an object with sequence of charav
		String s1 = "Rahul Shetty Academy";
		String s2 = "hello";

		String s3 = new String("Welcome");
		String s4 = new String("Welcome");

		String s = "Rahul Shetty Academy";
		String[] splittedString = s.split("Shetty");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1].trim());
		// System.out.println(splittedString[2]);

		System.out.println("===============");

		for (int i = 0; i < s.length(); i++) {

			System.out.println(s.charAt(i));

		}
		System.out.println("=======Reverse========");
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));

		}

	}

}
