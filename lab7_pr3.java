/*Q.3)Create Book having following attributes: Book ID, Title, Author and Price. Create Periodical which has the
following additional attributes: Period (weekly, monthly etc...) .Add a behavior to modify the Price and the Period
of the periodical. Display the updated periodical details.*/

import java.util.InputMismatchException;
import java.util.Scanner;

class PeriodNotCorrectException extends Exception
{

    PeriodNotCorrectException() 
    {
        super("incorrect period");  
    }
}

class NegativePriceException extends Exception
{
    NegativePriceException() 
    {
        super("price cannot be negative");  
    }
}

class Book
{
    double bookId;
    String title;
    String author;
    double price;

    Book(double bookId, String title, String author, double price)
    {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        try
        {
            if(price<0)
            {
                throw new NegativePriceException();
            }
            else
            {
                this.price = price;
            }
        }
        catch(NegativePriceException ex)
        {
            this.price = 0.0;
            ex.printStackTrace();
        }
    }
}

class Periodical extends Book
{
    String period;

    Periodical(double bookId, String title, String author, double price, String period)
    {
        super(bookId, title, author, price);
        try
        {
            if("day".equals(period.toLowerCase()) || "month".equals(period.toLowerCase()) || "year".equals(period.toLowerCase()))
            {
                this.period = period;
            }
            else
            {
                this.period = "NA";
                throw new PeriodNotCorrectException();
            }
        }
        catch(PeriodNotCorrectException ex)
        {
            ex.printStackTrace();
        }
    }

    void modifyPrice(double price)
    {
        try
        {
            if(price<0)
            {
                throw new NegativePriceException();
            }
            else
            {
                this.price = price;
            }
        }
        catch(NegativePriceException ex)
        {
            this.price = 0.0;
            ex.printStackTrace();
        }
        this.price = price;
    }
    void modifyPeriod(String period)
    {
        try
        {
            if("day".equals(period.toLowerCase()) || "month".equals(period.toLowerCase()) || "year".equals(period.toLowerCase()))
            {
                this.period = period;
            }
            else
            {
                this.period = "NA";
                throw new PeriodNotCorrectException();
            }
        }
        catch(PeriodNotCorrectException ex)
        {
            ex.printStackTrace();
        }
        this.period = period;
    }
}

public class lab7_pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bookId, price;
        String title, author, period; 

        System.out.println("enter the periodical details: ");
        System.out.print("title: ");
        title = sc.next();
        System.out.print("author: ");
        author = sc.next();
        System.out.print("period: ");
        period = sc.next();
        try
        {
            System.out.print("boodId: ");
            bookId = sc.nextDouble();
        }
        catch(InputMismatchException ex)
        {
            sc.nextLine();  //clears buffer
            bookId = 0;
            ex.printStackTrace();
        }
        try
        {
            System.out.print("price: ");
            price = sc.nextDouble();
        }
        catch(InputMismatchException ex)
        {
            sc.nextLine();      //clears buffer
            price = 0;
            ex.printStackTrace();
        }

        Periodical p = new Periodical(bookId, title, author, price, period);

        System.out.println("details: ");
        System.out.println(p.title+" "+p.author+" "+p.period+" "+p.bookId+" "+p.price);

        System.out.print("enter new price: ");
        try
        {
            price = sc.nextDouble();
        }
        catch(InputMismatchException ex)
        {
            price = 0.0;
            sc.nextLine();
            ex.printStackTrace();
        } 
        p.modifyPrice(price);

        System.out.print("enter new period: ");
        period = sc.next();
        p.modifyPeriod(period);

        System.out.println("details: ");
        System.out.println(p.title+" "+p.author+" "+p.period+" "+p.bookId+" "+p.price);

        sc.close();
    }
}
