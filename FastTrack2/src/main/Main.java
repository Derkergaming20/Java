package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        UserManager userManager = new UserManager();

        while (true) {
            clearScreen(); // Clear the screen on each iteration
            System.out.println("1. Register\n2. Login\n3. Exit");
            System.out.print("Choose an option: ");
            choice = input.nextInt();
            input.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    RegisterPage registerPage = new RegisterPage(userManager);
                    registerPage.displayRegistration(input);
                    break;
                case 2:
                    LoginPage loginPage = new LoginPage(userManager);
                    loginPage.displayLogin(input);
                    break;
                case 3:
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").toLowerCase().contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Error clearing screen: " + e.getMessage());
        }
    }
}
