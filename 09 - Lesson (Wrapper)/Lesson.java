public class Lesson {
	public static void main(String[] args) {
		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt("10000"); // Converting string to integer
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);

		Boolean bo = Boolean.parseBoolean("true"); // Converting a string "true" to boolean
		System.out.println(bo);
	}
}