package ex12inheritance;

public class Animal {
	private String species ;
	String gender;
	int age;
	public Animal(String species, int age ,String gender ) {
		this.species = species;
		this.age = age;
		this.gender = gender;
	}
	
	public void showAnimal() {
		System.out.println("동물의 종류->"+species);
		System.out.println("동물의 나이->"+age);
		System.out.println("동물의 성별->"+gender);
		
	}
	
	public String getSpecies() {
		return species;
	}
	

	
}
