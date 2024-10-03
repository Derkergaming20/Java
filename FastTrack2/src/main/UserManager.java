package main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserManager {
    public static final String FILENAME = "users.txt";
    private List<User> users;

    public UserManager() {
        this.users = new ArrayList<>();
        loadUsersFromFile(); // Load users from the file at startup
    }

    private void loadUsersFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] credentials = line.split(",");
                if (credentials.length == 2) {
                    String username = credentials[0].trim();
                    String password = credentials[1].trim();
                    users.add(new User(username, password));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("User file not found. A new file will be created upon registration.");
        } catch (IOException e) {
            System.out.println("Error reading user file: " + e.getMessage());
        }
    }

    public void addUser(User user) {
        users.add(user);
        saveUsersToFile(); // Save users back to the file after adding a new user
    }

    private void saveUsersToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            for (User user : users) {
                writer.write(user.getUsername() + "," + user.getPassword());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing to user file: " + e.getMessage());
        }
    }

    public boolean checkCredentials(String username, String password) {
        return users.stream()
                .anyMatch(user -> user.getUsername().equals(username) && user.getPassword().equals(password));
    }

    public boolean usernameExists(String username) {
        return users.stream()
                .anyMatch(user -> user.getUsername().equals(username));
    }
}
