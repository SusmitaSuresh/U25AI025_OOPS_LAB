import java.util.Scanner;

class InvalidPercentageException extends Exception
{

    InvalidPercentageException() 
    {
        super("invalid percentage");
    }

}

class Teacher
{
    String name;
    String department;
    Teacher(String name, String department)
    {
        this.name = name;
        this.department = department;
    } 
    void details()
    {
        System.out.println("teacher details: "+name+" "+department);
    }
} 

class Student extends Teacher 
{
    int rollno;
    double percentage;
    Student(String name, String department, int rollno, double percentage)
    {
        super(name, department);
        this.rollno = rollno;
        this.percentage = percentage;
    } 
    void details()      //overriding
    {
        System.out.println("student details: "+name+" "+department+" "+rollno+" "+percentage);
    }
} 
class lab7_pr4
{
    public static void main(String[] args) {
        String name, department;
        int rollno;
        double percentage;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter teacher details: ");
        System.out.print("name: ");
        name = sc.next();
        System.out.print("department: ");
        department = sc.next();

        Teacher t = new Teacher(name, department);
        t.details();

        System.out.println("enter student details: ");
        System.out.print("name: ");
        name = sc.next();
        System.out.print("department: ");
        department = sc.next();
        System.out.print("rollno: ");
        rollno = sc.nextInt();
        System.out.print("percentage: ");
        percentage = sc.nextDouble();
        try
        {
            if(percentage<0 || percentage>100)
            {
                throw new InvalidPercentageException();
            }
        }
        catch(InvalidPercentageException ex)
        {
            percentage = 0.0;
            ex.printStackTrace();
        }

        Student s = new Student(name, department, rollno, percentage);
        s.details();
    }
}