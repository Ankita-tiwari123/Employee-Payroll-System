package com.mycompany.employeepayrollsystem;

import java.util.ArrayList;

public class PayRollSystem {

    private ArrayList<Employee> employeeList;

    public PayRollSystem() {
        this.employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(int id) {
        Employee employeeToRemove = null;
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                employeeToRemove = employee;
                break;
            }
        }
        if (employeeToRemove != null) {
            employeeList.remove(employeeToRemove);
        }
    }
    
    public void DisplayEmployees(){
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

}
