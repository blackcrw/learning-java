package fundamentos;

public class fundamentos_dos_fundamentos {
	
	public static void main(String[] args) {
		hello();
		System.out.println("——————————————————");
		comment();
		System.out.println("——————————————————");
		vars_constants();
		System.out.println("——————————————————");
		circumference_area();
		System.out.println("——————————————————");
		notation_point();
	}

	private static void hello() {
		System.out.println("Hello World!");
	}

	private static void comment() {
		// Forma mais comum de comentário em Java

		/*
		 * Outra forma de comentário em Java 
		 */
		
		System.out.println("Comentário executado com sucesso!");
	}
	
	private static void vars_constants() {
		String name = "BLK"; // Variável
		int age = 19;
		String MUSIC = "Akuma"; // Constante
		
		System.out.println("Eu: "+name+", tenho "+age+" anos e estou ouvindo a música: "+MUSIC.concat("."));

		// Tipos numéricos inteiros
		byte ageCommerce = 23;
		short voosNumbers = 543;
		int id = 1231231;
		long points = 31212809120L;
		
		// Tipos numéricos reais
		// Não é possível converter um double em float
		// Colocamos um "F" no final para informar que é um literal float
		float salario = 11445.44F;
		double vendasAcumuladas = 2991792103.01;

		// Tipo booleano
		boolean ferias = false; // true
		
		// Tipo caractere
		// O tipo Char aceita apenas uma letra, podemos utilizar para definir status sobre alguma coisa.
		// Por exemplo um status para saber se está ativo ou inativo.
		char status = 'a';
	}
	
	private static void circumference_area() {
		double raio = 3.4;
		final double pi = 3.14159; // "final" informa que o valor dessa variável nunca poderá ser alterado. rsmuo: Transforma a variável *pi* em uma constante.

		System.out.println("Área: "+pi*raio*raio);
	}

	private static void notation_point() {
		String text  = "Bom dia X";
		text = text.replace("X", "Senhor!");
		text = text.toUpperCase();
		text = text.concat("!");
		
		System.out.println(text.length()+" — "+text);

		String msg = "Seja bem vindo".toUpperCase().concat(".");

		System.out.println(text.length()+" — "+msg);
		
		// Obs: Tipos primitivos não tem o operador "."
	}
}
