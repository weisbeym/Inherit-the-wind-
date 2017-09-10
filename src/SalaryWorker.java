/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yisroel
 */
public class SalaryWorker extends Worker 
{
    public double annualSalary;
    
    public SalaryWorker(String firstName, String lastName, String title, String ID, int YOB, double hourlyPayRate, double annualSalary) 
    {
        super(firstName, lastName, title, ID, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }
    
    @Override
    public double calculateWeeklyPay(double hoursWorked)
    {
        double weeklyPay = annualSalary / 52;
        
        return weeklyPay;  
    }
    
    @Override
    public String displayWeeklyPay(double hoursWorked)
    {
        double weeklyPay = annualSalary / 52;
        
        return "The weekly pay (the annual pay divided by 52) is: " + weeklyPay
                +"\n" + "The annual pay is: " + annualSalary;
    }
}
