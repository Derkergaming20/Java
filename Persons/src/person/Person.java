package person;

public class Person {

	private String name, gender;
	private int age;
	
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	
	public void setGender(String newGender) {
		gender = newGender;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public String getGender() {
		return gender;
	}
}
