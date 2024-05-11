public class Lesson {
	public static void main(String[] args) {
		double radius = 3.4;

		// "final" indicates that the value of this variable can never be changed. In summary: It turns the variable *pi* into a constant.
		final double pi = 3.14159;

		System.out.println("Area: " + pi * radius * radius);
	}
}