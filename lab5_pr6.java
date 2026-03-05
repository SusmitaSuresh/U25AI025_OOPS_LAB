/*Q.6 Createa class called Student which has the following methods:
 i). Average: which would accept marks of 3 examinations & return whether the student has passed or failed
Depending on whether he has scored an average above 50 or not.
 ii). Input name: which would accept the name of the student & returns the name. */


import java.util.Scanner;

class Student
{
    String name;
    void inputName(String name)         //takes input of string
    {
        this.name = name;
    }

    String inputName()                  //returns string
    {
        return name;
    }

    boolean average(double m1, double m2, double m3)
    {
        double avg = (m1+m2+m3)/3;
        if(avg>50)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

public class lab5_pr6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();

        System.out.print("enter student name: ");
        String name = sc.nextLine();
        stu.inputName(name);

        System.out.println("enter the three marks of student: ");
        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        double m3 = sc.nextDouble();
        if(stu.average(m1, m2, m3))
        {
            System.out.println("student " +stu.inputName()+" passed");
        }
        else
        {
            System.out.println("student " +stu.inputName()+" failed");

        }
    }
}
