package main;

public class Person {
		//declare variables
		private String name;
		private int age;
		private String gender;

		//declare calling
		public Person(String name, int age, String gender) {
			this.name = name;
			this.age = age;
			this.gender = gender;
		}
		
		//Setter
		public void setName(String newName) {
			this.name = newName;
			System.out.println(newName);
		}
		//Condition if age is less than 0
		public void setAge(int newAge) {
			//Output Error
			if(newAge <= 0) {
				System.out.println("Error Age!");
			}
			//Output Age
			else {
				this.age = newAge;
				System.out.println(newAge);
			}
		}
		public void setGender(String newGender) {
			this.gender = newGender;
			System.out.println(newGender);
		}
		
		//Getter
		public String getName() {
			return this.name;
		}
		public int getAge() {
			return this.age;
		}
		public String getGender() {
			return this.gender;
		}
}
