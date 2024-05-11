public class Lesson {
	
	public static void main(String[] args) {
		String name = "blackcrw"; // Variable
		int age = 19;

		String MUSIC = "Akuma"; // Constant
		
		System.out.println("Me: "+name+", I am "+age+" years old and I am listening to the song: "+MUSIC.concat("."));

		// Integer numeric types
		byte ageCommerce = 23;
		short flightNumbers = 543;
		int id = 1231231;
		long points = 31212809120L;
		
		// Real numeric types
		// It is not possible to convert a double to float
		// We put an "F" at the end to indicate that it is a float literal
		float salary = 11445.44F;
		double accumulatedSales = 2991792103.01;

		// Boolean type
		boolean vacation = false; // true
		
		// Character type
		// The Char type accepts only one letter, we can use it to define status about something.
		// For example, a status to know if it is active or inactive.
		char status = 'a';
	}
}