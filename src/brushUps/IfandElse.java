package brushUps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IfandElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 5, 8, 9, 10, 11, 13, 16, 18, 100 };

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
				break;
			} else {
				System.out.println(arr[i] + " is not multiple of 2");

			}
		}

		// =====================

		ArrayList<String> a = new ArrayList<String>();
		a.add("Rahul");
		a.add("Shetty");
		a.add("Jara");

		System.out.println(a.get(2));

		System.out.println("==============");

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println("==============");

		for (String e : a) {
			System.out.println(e);
		}
		System.out.println("======if item is present========");
		System.out.println(a.contains("Rahul"));

		System.out.println("==============");

		String[] name = { "Rahul", "Shetty", "Jara" };
		List<String> nameArrayList = Arrays.asList(name);
		System.out.println(nameArrayList.contains("Shetty"));
		
		if (nameArrayList.equals("Jara")) {
			System.out.println(name);
		}
		else { 
			System.out.println("unlisted");
		
			}
		
		}
	

}
