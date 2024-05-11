import java.util.Scanner;

public class Lesson {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a day of the week: ");

		String day = input.next();

		if (day.equalsIgnoreCase("Sunday")){
			System.out.println("Day: 1");
			
		} else if (day.equalsIgnoreCase("Monday")) {
			System.out.println("Day: 2");
			
		} else if (day.equalsIgnoreCase("Tuesday")) {
			System.out.println("Day: 3");
			
		} else if (day.equalsIgnoreCase("Wednesday")) {
			System.out.println("Day: 4");
			
		} else if (day.equalsIgnoreCase("Thursday")) {
			System.out.println("Day: 5");
			
		} else if (day.equalsIgnoreCase("Friday")) {
			System.out.println("Day: 6");
			
		} else if (day.equalsIgnoreCase("Saturday")) {
			System.out.println("Day: 7");

		} else {
			System.out.println("\nI couldn't find that day!");
		}

		input.close();

	}
}
