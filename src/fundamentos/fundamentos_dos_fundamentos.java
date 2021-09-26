package fundamentos;

import java.util.Date;
import java.util.Scanner;

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
		System.out.println("——————————————————");
		import_date();
		System.out.println("——————————————————");
		scanner_in();
		System.out.println("——————————————————");
		wrapper();
		System.out.println("——————————————————");
		logical_operators();
		System.out.println("——————————————————");
		condition_if_else();
	}

	private static void hello() {
		System.out.println("Oi");
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

	private static void import_date() {
		Date datetime = new Date();

		System.out.println(datetime);
	}
	
	private static void scanner_in() {
		Scanner scan_name = new Scanner(System.in);

		System.out.print("Qual seu nome ? : ");
		String name = scan_name.nextLine();
		
		Scanner scan_age = new Scanner(System.in);
		
		System.out.print("Qual sua idade ? : ");
		int age =  scan_age.nextInt();

		System.out.printf("Seu nome é %s, e você tem %d ano(s).%n", name, age);
	}

	// wrapper dos tipos primitivos
	private static void wrapper() {
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

	private static void logical_operators() {
		boolean condition_one = 1 > 2;
		boolean condition_second = true;

		System.out.println(condition_one && !condition_second);
		System.out.println(condition_one || condition_second);
		System.out.println(condition_second ^ condition_one);
		System.out.println(!condition_one);
		System.out.println(condition_second);
	}

	private static void condition_if_else() {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite um dia da semana: ");

		String day = input.next();

		if (day.equalsIgnoreCase("Domingo")){
			System.out.println("Dia: 1");
			
		} else if (day.equalsIgnoreCase("Segunda-Feira")) {
			System.out.println("Dia: 2");
			
		} else if (day.equalsIgnoreCase("Terça-Feira")) {
			System.out.println("Dia: 3");
			
		} else if (day.equalsIgnoreCase("Quarta-Feira")) {
			System.out.println("Dia: 4");
			
		} else if (day.equalsIgnoreCase("Quinta-Feira")) {
			System.out.println("Dia: 5");
			
		} else if (day.equalsIgnoreCase("Sexta-Feira")) {
			System.out.println("Dia: 6");
			
		} else if (day.equalsIgnoreCase("Sábado")) {
			System.out.println("Dia: 7");

		} else {
			System.out.println("\nNão encontrei esse dia!");
		}

		input.close();
	}
}
