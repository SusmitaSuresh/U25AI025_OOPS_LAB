/*Q.6)Define a class named Course having data members ID, Description, Duration and Fees. The class should have 
one parametrized constructors and GetData() function member to display the data. Create an array of 5 course 
objects and then display the data for all of them. */

import java.util.InputMismatchException;
import java.util.Scanner;

class NegativeTimeException extends Exception
{
    NegativeTimeException() 
    {
        super("no way you're breaking the laws of physics through java lmao");
    }
}

class NegativeFeesException extends Exception
{

    NegativeFeesException() 
    {
        super("no one is gonna pay you to go to school");
    }
    
}

class Course
{
    int memberId;
    String description;
    int duration;
    double fees;

    Course(int memberId, String description, int duration, double fees)
    {
        this.memberId = memberId;
        this.description = description;
        this.duration = duration;
        this.fees = fees;
    }

    void GetData()
    {
        System.out.println("details are: memberId: "+memberId+" description: "+description+" duration: "+duration+"years fees:"+fees+"rupees");
    }
}


public class lab7_pr6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course[] c = new Course[5];
        int memberId = 0, duration = 0;     //already defined
        String description = "NA";
        double fees = 0;
        for(int i=0; i<5; i++)
        {
            try
            {
                System.out.println("enter details: ");
                System.out.print("memberId: ");
                memberId = sc.nextInt();
                System.out.print("description: ");
                description = sc.next();
                System.out.print("duration (in years): ");
                duration = sc.nextInt();
                System.out.print("fees: ");
                fees = sc.nextDouble();
            }
            catch(InputMismatchException ex1)
            {
                ex1.printStackTrace();
                sc.nextLine();      //clears buffer aparantly
            }
            try
            {
                if(fees<0)      
                {
                    throw new NegativeFeesException();
                }
                if(duration<0)
                {
                    throw new NegativeTimeException();
                }
            }
            catch(NegativeFeesException ex2)     //if fees and time are negative both exceptions must be generated
            {
                try
                {
                    if(duration<0)
                    {
                        throw new NegativeTimeException();
                    }
                }
                catch(NegativeTimeException ex3)
                {
                    duration = 0;
                    ex3.printStackTrace();
                }
                finally
                {
                    fees = 0;
                    ex2.printStackTrace();
                }
            }
            catch(NegativeTimeException ex4)
            {
                duration = 0;
                ex4.printStackTrace();
            }
            finally
            {
                c[i] = new Course(memberId, description, duration, fees);
            }
        }

        for(int i=0; i<5; i++)
        {
            c[i].GetData();
        }
    }
}
