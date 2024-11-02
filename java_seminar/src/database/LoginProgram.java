package database;

import java.sql.*;
import java.util.Scanner;

public class LoginProgram {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "Prashantb123@";

        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String enteredUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();

        try {
            // Establish connection
            Connection conn = DriverManager.getConnection(url, username, password);

            // Create statement
            Statement stmt = conn.createStatement();

            // Query to retrieve user data
            String query = "SELECT * FROM user WHERE username = '" + enteredUsername + "' AND password = '" + enteredPassword + "'";

            // Execute query
            ResultSet rs = stmt.executeQuery(query);

            // Check if user exists
            if (rs.next()) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Invalid username or password");
            }

            // Close connection
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}