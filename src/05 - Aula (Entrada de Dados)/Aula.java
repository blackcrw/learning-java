import java.util.Scanner;

public class Aula {
	public static void main(String[] args) {
		Scanner scan_name = new Scanner(System.in);

		System.out.print("Qual seu nome ? : ");
		String name = scan_name.nextLine();
		
		Scanner scan_age = new Scanner(System.in);
		
		System.out.print("Qual sua idade ? : ");
		int age =  scan_age.nextInt();

		System.out.printf("Seu nome é %s, e você tem %d ano(s).%n", name, age);
	}
}