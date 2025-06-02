/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.jdbc;

/**
 *
 * @author Admin
 */
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeDAO.addEmployee("Alice Cooper", "Developer", 70000);
        EmployeeDAO.addEmployee("Bob Marley", "Manager", 80000);

        List<Employee> employees = EmployeeDAO.getAllEmployees();
        employees.forEach(System.out::println);
    }
}
