package person;

public class Main {

	public static void main(String[] args) {
		//Tingal
		Person personName = new Person();
		personName.setName("Tingal, Dexter Paul");
		System.out.println(personName.getName());
		
		Person personAge = new Person();
		personAge.setAge(18);
		System.out.println(personAge.getAge());
		
		Person personGender = new Person();
		personGender.setGender("Male\n");
		System.out.println(personGender.getGender());
		
		//Estole
		Person personName1 = new Person();
		personName1.setName("Estole, Raygie");
		System.out.println(personName1.getName());
		
		Person personAge1 = new Person();
		personAge1.setAge(20);
		System.out.println(personAge1.getAge());
		
		Person personGender1 = new Person();
		personGender1.setGender("Male\n");
		System.out.println(personGender1.getGender());
		
		//Sabalboro
		Person personName2 = new Person();
		personName2.setName("Sabalboro, Reynaldo Kenneth");
		System.out.println(personName2.getName());
		
		Person personAge2 = new Person();
		personAge2.setAge(20);
		System.out.println(personAge2.getAge());
		
		Person personGender2 = new Person();
		personGender2.setGender("Male\n");
		System.out.println(personGender2.getGender());
	}
}
