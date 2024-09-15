package persons2;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    	//Scanner
        Scanner input = new Scanner(System.in);
        
        //Single Instance
        Persons2 person = new Persons2();
        
        //Get users name
        System.out.print("Enter your name: ");
        person.setName(input.next());
        
        //Get users gender
        System.out.print("Enter your Gender: ");
        person.setGender(input.next());
        
        //Get users age
        System.out.print("Enter your Age: ");
        //Ensure the input is parsed to an integer
        person.setAge(Integer.parseInt(input.next()));
        
        //Output
        System.out.println("\nHello "+ person.getName() + "!");
        System.out.println("Your gender is "+ person.getGender());
        System.out.println("You are "+ person.getAge() + " years old");
        
        //Close input
        input.close();
    }
}