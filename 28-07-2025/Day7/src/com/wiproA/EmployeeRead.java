package com.wiproA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class EmployeeRead {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/company";
        String username = "root";
        String password = "Memanas@2304";

        String sql = "SELECT * FROM employee";

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            try (Connection connection = DriverManager.getConnection(url, username, password)) {

                
                Statement statement = connection.createStatement();

                
                ResultSet resultSet = statement.executeQuery(sql);

                
                System.out.println("ID\tName\t\t\tDepartment");
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("emp_name");
                    String dept = resultSet.getString("department");

                    System.out.println(id + "\t" + name + "\t\t" + dept);
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }
}
