
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yisroel
 */
public class Person 
{
   private String firstName;
   private String lastName;
   private String title;
   private String ID;
   private int YOB;
   
   Calendar cal = Calendar.getInstance();
   

    public Person(String firstName, String lastName, String title, String ID, int YOB) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.ID = ID;
        this.YOB = YOB;
        
    }
    
    public String getFirstName() 
    {
        return firstName;
    }

    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }

    public String getLastName() 
    {
        return lastName;
    }

    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getID() 
    {
        return ID;
    }

    public int getYOB() 
    {
        return YOB;
    }
    
    public String fullName()
    {
        return firstName + " " + lastName;
    }
    
    public String formalName()
    {
        return title + " " + firstName + " " + lastName;
    }
    
    public int getAge()
    {
        return cal.YEAR - YOB;
    }
    
    // Add this new overloaded method of getAge to the Person class
    //public int getAge(int year) // uses YOB to calculate age for a specified year
    public int getAge(int year)
    {
        return year - YOB;
    }        

    
    public String toCSVRecord()
    {
       return firstName + ", " +
               lastName + ", " +
               title + ", " +
               ID + ", " +
               YOB;
    }
}
