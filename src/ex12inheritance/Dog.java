package ex12inheritance;

public class Dog extends Animal {
	
	public String dogKind, name;
	
	public Dog(String species, int age, String gender, String dogKind, String name) {
		super(species,age, gender);
		this.dogKind = dogKind;
		this.name = name;
	}

	public void bark() {
		System.out.printf("이름이 %s이고 종(%s)이 %s인 강아지가 짖는다."
				, name, super.getSpecies(), dogKind);
	}
	public void showDog() {
		showAnimal();
		System.out.println("종류는:"+ dogKind);
		System.out.println("이름은:"+ name);

	}
}
