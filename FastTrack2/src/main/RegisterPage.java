package main;

import java.util.Scanner;

public class RegisterPage {
    private UserManager userManager;

    public RegisterPage(UserManager userManager) {
        this.userManager = userManager;
    }

    public void displayRegistration(Scanner input) {
        String username;
        String password;

        while (true) {
            Main.clearScreen(); // Clear screen before registration
            System.out.println("=== Registration ===");
            System.out.print("Enter a username: ");
            username = input.nextLine();

            if (userManager.usernameExists(username)) {
                System.out.println("Username already exists. Please choose a different one.");
            } else {
                System.out.print("Enter a password: ");
                password = input.nextLine();
                userManager.addUser(new AdminPage(username, password));
                System.out.println("Registration successful!");
                break;
            }
        }

        System.out.println("\nPress Enter to continue...");
        input.nextLine(); // Wait for Enter
    }
}
