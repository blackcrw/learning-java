public class Aula {
	public static void main(String[] args) {
		boolean condition_one = 1 > 2;
		boolean condition_second = true;

		System.out.println(condition_one && !condition_second);
		System.out.println(condition_one || condition_second);
		System.out.println(condition_second ^ condition_one);
		System.out.println(!condition_one);
		System.out.println(condition_second);
	}
}