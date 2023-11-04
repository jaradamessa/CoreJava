package brushUps;

public class MethodsDemo {

	public static void main(String[] args) {

		String name = getData();
		System.out.println(name);
		
		System.out.println(getData1());

		// MethodsDemo2 d = new MethodsDemo2();//for non static method

		// MethodsDemo2.getUserData();//only to print directly the syso declared in a
		// that class
		System.out.println(MethodsDemo2.getUserData());
	}

	public static String getData() {

		System.out.println("hello world");
		return "rahul shetty";
	}
	public static String getData1() {

		System.out.println("hello data");
		return "David";

}
}
