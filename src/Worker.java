/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yisroel
 */
public class Worker extends Person {
    public double hourlyPayRate;
    
    public Worker(String firstName, String lastName, String title, String ID, int YOB, double hourlyPayRate) 
    {
        super(firstName, lastName, title, ID, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }
    
    public double calculateWeeklyPay(double hoursWorked)
    {
        double wages;
        double overTime;
        double overTimePay;
        
        wages = hoursWorked * hourlyPayRate;
        overTime = hoursWorked - 40;
        overTimePay = (overTime * hourlyPayRate) * 1.5;
        
        if(hoursWorked > 40)
        {
            return wages + overTimePay;
        }
        else
        {    
            return wages;
        }
    }
    
    public String displayWeeklyPay(double hoursWorked)
    {
        double wages;
        double overTime;
        double overTimePay;
        double totalPay;
        
        wages = hoursWorked * hourlyPayRate;
        overTime = hoursWorked - 40;
        overTimePay = (overTime * hourlyPayRate) * 1.5;
        totalPay = wages + overTimePay;
        
        if(hoursWorked <= 40)
        {
            return "Hours worked: " + hoursWorked + "\n"
            + "Overtime hours: 0\n" + "Normal Pay: " + wages
            + "\n" + "Overtime pay: 0\n" + "Total pay: " + 
            wages;
        }
        else
        {
            return "Hours worked: " + hoursWorked + "\n"
            + "Overtime hours: " + overTime + "\n" + "Normal Pay: " + wages
            + "\n" + "Overtime pay: " + overTimePay + "\n" + "Total pay: " + 
            totalPay;
        }
    }
}
