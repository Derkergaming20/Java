package Admin;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class User {
    private int id;
    private String name;
    private String role;

    public User(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + '\'' + ", role='" + role + '\'' + '}';
    }
}

public class AdminPage {
    private List<User> users;

    public AdminPage() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void deleteUser(int userId) {
        users.removeIf(user -> user.getId() == userId);
    }

    public void changeUserRole(int userId, String newRole) {
        Optional<User> userOptional = users.stream()
                .filter(user -> user.getId() == userId)
                .findFirst();

        userOptional.ifPresent(user -> user.setRole(newRole));
    }

    public void displayUsers() {
        if (users.isEmpty()) {
            System.out.println("No users found.");
        } else {
            users.forEach(System.out::println);
        }
    }

    public static void main(String[] args) {
        AdminPage adminPage = new AdminPage();

        // Adding users
        adminPage.addUser(new User(1, "Alice", "User"));
        adminPage.addUser(new User(2, "Bob", "User"));
        adminPage.addUser(new User(3, "Charlie", "Admin"));

        // Displaying users
        System.out.println("Current Users:");
        adminPage.displayUsers();

        // Changing role
        adminPage.changeUserRole(1, "Moderator");
        System.out.println("\nAfter changing Alice's role:");
        adminPage.displayUsers();

        // Deleting a user
        adminPage.deleteUser(2);
        System.out.println("\nAfter deleting Bob:");
        adminPage.displayUsers();
    }
}
