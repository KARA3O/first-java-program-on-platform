/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mm;

/**
 *
 * @author karab
 */
public class Employee {
    
    private String staffNumber;
    private Salary salary;

    public Employee() {
    }

    public Employee(String staffNumber, Salary salary) {
        this.staffNumber = staffNumber;
        this.salary = salary;
    }

    public String getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(String staffNumber) {
        this.staffNumber = staffNumber;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }
    
    public void displayEmployeeSalary(){
        System.out.println(staffNumber+ "the salary is: "+ salary.computeSalary());
    }
}
