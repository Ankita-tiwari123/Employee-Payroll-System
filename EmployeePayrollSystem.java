
package com.mycompany.employeepayrollsystem;

public class EmployeePayrollSystem {

    public static void main(String[] args) {
        PayRollSystem payrollsystem = new PayRollSystem();
        
        FullTimeEmployee emp1 = new FullTimeEmployee("Ankita",11,30000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Akanksha",12,40,50);
        FullTimeEmployee emp3 = new FullTimeEmployee("Janvi",13,30000);
        PartTimeEmployee emp4 = new PartTimeEmployee("Reena",14,40,50);
        FullTimeEmployee emp5 = new FullTimeEmployee("Harsh",15,30000);
        PartTimeEmployee emp6 = new PartTimeEmployee("pallu",16,40,50);
        payrollsystem.addEmployee(emp6);
        payrollsystem.addEmployee(emp1);
        payrollsystem.addEmployee(emp2);
        payrollsystem.addEmployee(emp3);
        payrollsystem.addEmployee(emp4);
        payrollsystem.addEmployee(emp5);
        
        System.out.println("====== Display Initial Employee details ======");
        
        payrollsystem.DisplayEmployees();
        
        
        System.out.println("Remove Employee : ");
        payrollsystem.removeEmployee(12);
        payrollsystem.removeEmployee(11);
        
        System.out.println("==== Remaining Employee Details ======");
        payrollsystem.DisplayEmployees();
    }
}
