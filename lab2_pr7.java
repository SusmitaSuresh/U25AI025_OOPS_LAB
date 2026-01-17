/*Q7.)A parking garage charges a $2.00 minimum fee to park for up to three hours. The garage charges an
additional $0.50 per hours for each hours or part thereof in excess of three hours. The maximum charge for any
given 24-hours period is $10.00.Assume that no car parks for longer than 24 hours at a time. Write an application
that calculates and displays the parking charges for each customers who parked in the garage yesterday. You
should enter the hours parked for each customers . The program should display the charge for the current
customers and should calculate and display the running total os yesterday's receipts. It should use the method
calculate charges to determine the charge for each customer. */
import java.util.Scanner;
class ParkingCharges
{
    String name;
    double hours;
    static double runningTotal=0;
    ParkingCharges(String name, double hours)
    {
        this.name = name;
        this.hours = hours;
    }
    double parkingCharges()
    {
        if(hours<=3)
        {
            return 2.00;
        }
        else if(hours>3 && hours<=19)
        {
            return (2.00+(hours-3)*0.5);
        }
        else
            return 10.00;
    }
    void runTotalCalc()
    {
        runningTotal = runningTotal + parkingCharges();
    }
}
public class lab2_pr7 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        String name;
        double hours;
        System.out.print("enter number of customers: ");
        n = sc.nextInt();
        ParkingCharges p[] = new ParkingCharges[n];
        for(int i=0; i<n; i++)
        {
            System.out.print("enter the name of customer: ");
            name = sc.next();
            System.out.print("enter the hours parked: ");
            hours = sc.nextDouble();
            p[i] = new ParkingCharges(name, hours);
        }
        for(int i=0; i<n; i++)
        {
            System.out.println("customer "+p[i].name+"has parking charge "+p[i].parkingCharges());
            p[i].runTotalCalc();
        }
        System.out.print("total of yesterday's reciept is: "+ ParkingCharges.runningTotal);
        sc.close();
    }
}
