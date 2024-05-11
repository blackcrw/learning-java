import java.util.Scanner;

public class Aula {
	public static void main(String[] args) {
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