/*Q.4) Define a class called fruit with the following attributes :
1. Name of the fruit.
2. Single fruit or bunch fruit.
3. Price.
Define a suitable constructor and displayFruit() method that displays values of all the
attributes. Write a program that creates 2 objects of fruit class and display their attributes */

import java.util.Scanner;

class Fruit
{
    String name;
    int numOfFruits;
    double price;

    Fruit(String name, int numOfFruits, double price)
    {
        this.name = name;
        if(numOfFruits>0)
        {
            this.numOfFruits = numOfFruits;
        }
        else
        {
            this.numOfFruits = 0;
        }
        this.price = price;
    }

    void display()
    {
        System.out.println("fruits info: ");
        System.out.println("name: "+name);
        System.out.print("number of fruits: "+numOfFruits);
        if(numOfFruits>1)
        {
            System.out.println("-->bunch of fruits");
        }
        else if(numOfFruits == 1)
        {
            System.out.println("-->single fruit");
        }
        else
        {
            System.out.println("-->no fruit :(");
        }
        System.out.println("price per fruit: "+price);
        System.out.println("total price for "+numOfFruits+" number of fruit is: "+(numOfFruits*price));
    }
}

public class lab5_pr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int numOfFruits;
        double price;
        System.out.print("enter name of fruit: ");
        name = sc.next();
        System.out.print("enter quantity of fruit: ");
        numOfFruits = sc.nextInt();
        System.out.print("enter price per fruit: ");
        price = sc.nextDouble();
        Fruit f1 = new Fruit(name, numOfFruits, price);

        System.out.print("enter name of fruit: ");
        name = sc.next();
        System.out.print("enter quantity of fruit: ");
        numOfFruits = sc.nextInt();
        System.out.print("enter price per fruit: ");
        price = sc.nextDouble();
        Fruit f2 = new Fruit(name, numOfFruits, price);
        System.out.println();
        f1.display();
        System.out.println();
        f2.display();

        sc.close();
    }
}
