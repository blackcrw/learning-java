public class Aula {
	
	public static void main(String[] args) {
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
}