public class Aula {
	public static void main(String[] args) {
		double raio = 3.4;

		// "final" informa que o valor dessa variável nunca poderá ser alterado. resumo: Transforma a variável *pi* em uma constante.
		final double pi = 3.14159;

		System.out.println("Área: " + pi * raio * raio);
	}
}