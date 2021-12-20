public class Aula {
	public static void main(String[] args) {
		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt("10000"); // Convertendo string para inteiro
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);

		Boolean bo = Boolean.parseBoolean("true"); // Convertendo uma string "true" para boolean
		System.out.println(bo);
	}
}