package main;

import java.util.Scanner;

public class LoginPage {
    private UserManager userManager;

    public LoginPage(UserManager userManager) {
        this.userManager = userManager;
    }

    public void displayLogin(Scanner input) {
        String username;
        String password;

        Main.clearScreen(); // Clear screen before login
        System.out.println("=== Login ===");
        System.out.print("Enter your username: ");
        username = input.nextLine();

        System.out.print("Enter your password: ");
        password = input.nextLine();

        if (userManager.checkCredentials(username, password)) {
            System.out.println("Login successful! Going to main screen...");
        } else {
            System.out.println("Incorrect username or password, please try again.");
        }

        System.out.println("\nPress Enter to continue...");
        input.nextLine(); // Wait for Enter
    }
}
