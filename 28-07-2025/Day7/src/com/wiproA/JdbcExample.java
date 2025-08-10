package com.wiproA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcExample {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/company";
        String username = "root";
        String password = "Memanas@2304";

        String sql = "INSERT INTO employee (emp_name, department) VALUES (?, ?)";

        String[][] employees = {
            {"Jaiswal Memanasa", "Java Full Stack"},
            {"Rahul Verma", "Data Science"},
            {"Sneha Singh", "UI/UX Design"}
        };

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);

                for (String[] emp : employees) {
                    preparedStatement.setString(1, emp[0]);
                    preparedStatement.setString(2, emp[1]);

                    int rowsAffected = preparedStatement.executeUpdate();

                    if (rowsAffected > 0) {
                        System.out.println("Inserted: " + emp[0]);
                    } else {
                        System.out.println("Failed to insert: " + emp[0]);
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }
}
