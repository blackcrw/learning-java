class Pessoa {
	private String name;
	private int age;

	public static void set_name(String name) {
		this.name = name;
	}

	public static void set_age(int age) {
		this.age = age;
	}

	public static String get_name() {
		return this.name;
	}

	public static int get_age() {
		return this.age;
	}
}

class Aula {
	public static void main(String[] args) {
		Pessoa pessoa = Pessoa();

		pessoa.set_name("João");
		pessoa.set_age(25);

		System.out.println("Olá, meu nome é " + pessoa.get_name() + " e tenho ", String.parseString(pessoa.get_age()));
	}
}