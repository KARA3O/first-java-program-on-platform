/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mm;

/**
 *
 * @author karab
 */
public class Mm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Salary sal1 = new Salary(5.5,4,8);
       
        Employee empi1 = new Employee("fefgf",sal1);
       empi1.displayEmployeeSalary();
    }
    
}
