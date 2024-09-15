package persons2;

public class Persons2 {

    // Declare variable
    private String name;
    private String gender;
    private int age;
    
    // Set Person Details
    public void setName(String newName) {
        name = newName;
    }
    public void setGender(String newGender) {
    	gender = newGender;
    }
    public void setAge(int newAge) {
    	age = newAge;
    }
    
    // Get Person Details
    public String getName() {
        return name;
    }
    public String getGender() {
    	return gender;
    }
    public int getAge() {
    	return age;
    }
}
