import java.util.Scanner;

public class Lesson {
	public static void main(String[] args) {
		Scanner scan_name = new Scanner(System.in);

		System.out.print("What is your name? : ");
		String name = scan_name.nextLine();

		Scanner scan_age = new Scanner(System.in);

		System.out.print("What is your age? : ");
		int age = scan_age.nextInt();

		System.out.printf("Your name is %s, and you are %d year(s) old.%n", name, age);
	}
}
