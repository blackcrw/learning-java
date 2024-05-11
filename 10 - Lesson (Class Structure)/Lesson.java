class Person {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}
}

class Lesson {
	public static void main(String[] args) {
		Person person = new Person();

		person.setName("John");
		person.setAge(25);

		System.out.println("Hello, my name is " + person.getName() + " and I am " + person.getAge() + " years old.");
	}
}