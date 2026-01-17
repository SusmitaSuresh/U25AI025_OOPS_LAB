import java.util.Scanner;
class Employee 
{
    String name;
    String lastName;
    double monthlySalary;
    Employee()
    {
        super();
    }
    void setName(String name)
    {
        this.name = name;
    }
    void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    void setMonthlySalary(double monthlySalary)
    {
        if(monthlySalary>0)
        {
            this.monthlySalary = monthlySalary;
        }
    }
    String getName()       
    {
        return name;
    }
    String getLastName()
    {
        return lastName;
    }
    double getMonthlySalary()
    {
        return monthlySalary;
    }
    void salaryHike()
    {
        monthlySalary = monthlySalary*1.1;
    }
}
public class lab2_pr3 {
    public static void main(String []args)
    {
        String name, lastName;
        double monthlySalary;
        Scanner sc = new Scanner(System.in);
        Employee emp1 = new Employee();
        System.out.println("enter the details of employee 1: ");
        System.out.print("enter the first name: ");
        name = sc.next();
        emp1.setName(name);
        System.out.print("enter the last name: ");
        lastName = sc.next();  
        emp1.setLastName(lastName);
        System.out.print("enter the monthly salary: ");
        monthlySalary = sc.nextDouble(); 
        emp1.setMonthlySalary(monthlySalary);
        System.out.println("Employee name is: "+emp1.getName()+" "+emp1.getLastName());
        System.out.println("Yearly salary is: "+((emp1.getMonthlySalary())*12));
        Employee emp2 = new Employee();
        System.out.println("enter the details of employee 2: ");
        System.out.print("enter the first name: ");
        name = sc.next();
        emp2.setName(name);
        System.out.print("enter the last name: ");
        lastName = sc.next();  
        emp2.setLastName(lastName);
        System.out.print("enter the monthly salary: ");
        monthlySalary = sc.nextDouble(); 
        emp2.setMonthlySalary(monthlySalary);
        System.out.println("Employee name is: "+emp2.getName()+" "+emp2.getLastName());
        System.out.println("Yearly salary is: "+((emp2.getMonthlySalary())*12));
        emp1.salaryHike();
        emp2.salaryHike();
        System.out.println("After hike, yearly salary of emp1 is: "+((emp1.getMonthlySalary())*12));
        System.out.println("After hike, yearly salary of emp2 is: "+((emp2.getMonthlySalary())*12));
        sc.close();
    }
}
