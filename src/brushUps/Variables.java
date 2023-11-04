package brushUps;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myNum = 5;
		String website = "Rahul Shetty Academy";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;

		System.out.println(myNum + " is the value stored");
		System.out.println(website);
		System.out.println("=======================");

		// Arrays of size for fixed storage of elements-
		int[] arr = new int[5];

		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 6;
		arr[3] = 8;
		arr[4] = 10;

		// initialize arrays with value
		int[] arr2 = { 2, 4, 6, 8, 10 };

		System.out.println(arr2[1]);

		// For loop
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}

		System.out.println("=========reverse=======");

		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.println(arr[i]);

		}
		System.out.println("=======================");

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		String[] name = { "Rahul ", "Shetty ", "Academy" };
		for (int i = 0; i < name.length; i++)
			System.out.println(name[i]);

		System.out.println("========for each loop========");
		for (String e : name) {

			System.out.print(e);

		}
	}
}
