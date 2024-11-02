package database;

import java.sql.*;

public class DatabaseCON {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "Prashantb123@";

        try {
            // Establish connection
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database");

            // Create statement
            Statement stmt = conn.createStatement();

            // Create table
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS employees (id INT PRIMARY KEY, name VARCHAR(255), age INT)");

            // Insert data
            stmt.executeUpdate("INSERT INTO employees (id, name, age) VALUES (1, 'John Doe', 30)");

            // Read data
            ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Age: " + rs.getInt("age"));
            }

            // Update data
            stmt.executeUpdate("UPDATE employees SET age = 31 WHERE id = 1");

            // Delete data
            stmt.executeUpdate("DELETE FROM employees WHERE id = 1");

            // Close connection
            conn.close();
            System.out.println("Disconnected from database");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}