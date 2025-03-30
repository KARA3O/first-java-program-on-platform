/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mm;

/**
 *
 * @author karab
 */
public class Salary {
    
    private double hourlyRate;
    private int regularHours;
    private int overTimeHours;

    public Salary() {
    }

    public Salary(double hourlyRate, int regularHours, int overTimeHours) {
        this.hourlyRate = hourlyRate;
        this.regularHours = regularHours;
        this.overTimeHours = overTimeHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getRegularHours() {
        return regularHours;
    }

    public void setRegularHours(int regularHours) {
        this.regularHours = regularHours;
    }

    public int getOverTimeHours() {
        return overTimeHours;
    }

    public void setOverTimeHours(int overTimeHours) {
        this.overTimeHours = overTimeHours;
    }
    
    public double computeSalary(){
        return hourlyRate*regularHours+(1.5*hourlyRate*overTimeHours);
     
    }
    
}
