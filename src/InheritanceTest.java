
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yisroel
 */
public class InheritanceTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ArrayList<Worker> workForce = new ArrayList<>();
        String firstName;
        String lastName;
        String title;
        String ID;
        int YOB;
        double hoursWorked;
        double hourlyPayRate;
        double annualSalary;
        
        Worker bob = new Worker(firstName = "Bob", lastName = "Johnson", title = "Mr.", 
                                ID = "0000001", YOB = 1970, hourlyPayRate = 22.45);
        
        Worker david = new Worker(firstName = "David", lastName = "Smith", title = "Mr.", 
                                ID = "0000002", YOB = 1976, hourlyPayRate = 25.55);
        
        Worker charles = new Worker(firstName = "Charles", lastName = "Nemoy", title = "Mr.", 
                                ID = "0000003", YOB = 1969, hourlyPayRate = 29.82);
        
        SalaryWorker emma = new SalaryWorker(firstName = "Emma", lastName = "Fletcher", title = "Mrs.", 
                                ID = "0000004", YOB = 1982, hourlyPayRate = 22.45, annualSalary = 75000.0);
        
        SalaryWorker andrew = new SalaryWorker(firstName = "Andrew", lastName = "Remington", title = "Dr.", 
                                ID = "0000005", YOB = 1985, hourlyPayRate = 22.45, annualSalary = 80000.0);
         
        SalaryWorker sarah = new SalaryWorker(firstName = "Sarah", lastName = "Weiss", title = "Ms.", 
                                ID = "0000006", YOB = 1981, hourlyPayRate = 22.45, annualSalary = 89000.0); 
        
        workForce.add(bob);
        workForce.add(david);
        workForce.add(charles);
        workForce.add(emma);
        workForce.add(andrew);
        workForce.add(sarah);
        
        for(int i = 0; i < 3; i++)
        {
            hoursWorked = 40;
            
            if(i == 1)
            {
                hoursWorked = 50;
            }
            
            System.out.println("Week " + (i + 1));
            System.out.println("============================================");
            
            for(Worker Worker: workForce)
            {
                System.out.println(Worker.fullName());
                System.out.println(Worker.displayWeeklyPay(hoursWorked));
                System.out.println("\n");
            }
        }
    }
    
}
