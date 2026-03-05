/*Q.1) Develop a program that accepts an initial amount of money (called the principal), a simple annual interest
rate, and a number of months will compute the balance at the end of that time. Assume that no additional
deposits or withdrawals are made and that a month is 1/12 of a year. Total interest is the product of the
principal, the annual interest rate expressed as a decimal, and the number of years. */

import java.util.InputMismatchException;
import java.util.Scanner;

class NegativeBalanceException extends Exception
{
    NegativeBalanceException() 
    {
        super("no way you're in debt, fair tho the economy sucks");
    }
}
class NegativeInterestException extends Exception
{
    NegativeInterestException() 
    {
        super("why do you wanna lose money bruh💀");
    }
}
class NegativeTimeException extends Exception
{
    NegativeTimeException() 
    {
        super("no way you're breaking the laws of physics through java lmao");
    }
}

class CalculateInterest
{
    double si;         //simple interest
    double pr;         //principle
    double nom;        //no. of months, nom haha :)  reminds me of om nom.

    CalculateInterest(double si, double pr, double noy) 
    {
        this.si = si;
        this.pr = pr;
        this.nom = noy/12;
    }

    double balance()
    {
        return (pr+ pr*si*nom/100);
    }
}

public class lab7_pr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pr=0.0, si=0.0, noy=0.0;
        try
        {
            System.out.print("enter the principle amount: ");
            pr = sc.nextDouble();
            System.out.print("enter the simple interest: ");
            si = sc.nextDouble();
            System.out.print("enter the no. of years: ");
            noy = sc.nextDouble();
            if(pr<0)
            {
                throw new NegativeBalanceException();
            }
            if(si<0)
            {
                throw new NegativeInterestException();
            }
            if(noy<0)
            {
                throw new NegativeTimeException();
            }
        }
        catch(InputMismatchException ex)
        {
            pr = 0;
            si = 0;
            noy = 0;
            ex.printStackTrace();
        } 
        catch(NegativeBalanceException ex)      
        {
            pr = 0;
            si = 0;
            noy = 0;
            ex.printStackTrace();
        }
        catch(NegativeInterestException ex)
        {
            pr = 0;
            si = 0;
            noy = 0;
            ex.printStackTrace();
        }
        catch(NegativeTimeException ex)      
        {
            pr = 0;
            si = 0;
            noy = 0;
            ex.printStackTrace();
        }
        finally
        {
            CalculateInterest ci = new CalculateInterest(si, pr, noy);
            System.out.println("balance is: "+ci.balance());
        }
    }
}
