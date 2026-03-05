/*Q.2)Write a class vehicle .Define suitable attributes and methods. Write subclasses of Vehicle like Car, Bicycle,
Scooter.
Assume suitable required attributes. Write constructor for each and define a method maxSpeed() in each
class
Which prints the maximum speed of the vehicle? (Use of super keyword is expected in the constructor of
inherited classes) */

import java.util.InputMismatchException;
import java.util.Scanner;

class NegativePriceException extends Exception
{
    NegativePriceException() 
    {
        super("price cannot be negative");  
    }
}

class Vehicle
{
    double price;
    String colour;
}

class Car extends Vehicle
{
    String Name;
    Car(String Name, String colour, double price)
    {
        this.Name = Name;
        this.colour = colour;
        this.price = price;
    }
    double maxSpeed()
    {
        return 200;
    }
    void details()
    {
        System.out.println("details of car:");
        System.out.println("name: "+Name+" colour: "+colour+" price: "+price+" maxspeed: "+maxSpeed());
    }
}

class Bicycle extends Vehicle
{
    String Name;
    Bicycle(String Name, String colour, double price)
    {
        this.Name = Name;
        this.colour = colour;
        this.price = price;
    }
    double maxSpeed()
    {
        return 40;
    }
    void details()
    {
        System.out.println("details of bicycle:");
        System.out.println("name: "+Name+" colour: "+colour+" price: "+price+" maxspeed: "+maxSpeed());
    }
}

class Scooter extends Vehicle
{
    String Name;
    Scooter(String Name, String colour, double price)
    {
        this.Name = Name;
        this.colour = colour;
        this.price = price;
    }
    double maxSpeed()
    {
        return 120;
    }
    void details()
    {
        System.out.println("details of scooter:");
        System.out.println("name: "+Name+" colour: "+colour+" price: "+price+" maxspeed: "+maxSpeed());
    }
}

public class lab7_pr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price;
        String name, colour;

        System.out.println("enter car details: ");
        try
        {
            System.out.print("enter price: ");
            price = sc.nextDouble();
            if(price<0)
            {
                throw new NegativePriceException();
            }
        }
        catch(InputMismatchException ex1)
        {
            price = 0.0;
            ex1.printStackTrace();
        }
        catch(NegativePriceException ex2)
        {
            price = 0.0;
            ex2.printStackTrace();
        }
        System.out.print("enter name: ");
        name = sc.next();
        System.out.print("enter colour: ");
        colour = sc.next();
        Car c = new Car(name, colour, price);
        c.details();

        System.out.println("enter Scooter details: ");
        try
        {
            System.out.print("enter price: ");
            price = sc.nextDouble();
            if(price<0)
            {
                throw new NegativePriceException();
            }
        }
        catch(InputMismatchException ex1)
        {
            price = 0.0;
            ex1.printStackTrace();
        }
        catch(NegativePriceException ex2)
        {
            price = 0.0;
            ex2.printStackTrace();
        }
        System.out.print("enter name: ");
        name = sc.next();
        System.out.print("enter colour: ");
        colour = sc.next();
        Scooter s = new Scooter(name, colour, price);
        s.details();

        System.out.println("enter bicycle details: ");
        try
        {
            System.out.print("enter price: ");
            price = sc.nextDouble();
            if(price<0)
            {
                throw new NegativePriceException();
            }
        }
        catch(InputMismatchException ex)
        {
            price = 0.0;
            ex.printStackTrace();
        }
        catch(NegativePriceException ex2)
        {
            price = 0.0;
            ex2.printStackTrace();
        }
        System.out.print("enter name: ");
        name = sc.next();
        System.out.print("enter colour: ");
        colour = sc.next();
        Bicycle b = new Bicycle(name, colour, price);
        b.details();
    }
}
