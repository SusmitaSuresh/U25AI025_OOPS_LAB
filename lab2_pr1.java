import java.util.Scanner;
class DailyDrivingCost{
    float miles, cost, mpg, avg_fees, tolls;
    DailyDrivingCost(float miles, float cost, float mpg, float avg_fees, float tolls)
    {
        this.miles=miles;    
        this.cost=cost;
        this.mpg=mpg;
        this.avg_fees=avg_fees;
        this.tolls=tolls;
    }
    float dailyDrivingCost()
    {
        return (avg_fees+tolls+((miles/mpg)*cost));
    }
}
public class lab2_pr1{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of miles driven: ");
        float miles = sc.nextFloat();
        System.out.print("enter cost per gallon of gasoline: ");
        float cost = sc.nextFloat();
        System.out.print("enter miles per gallon of vehicle driven: ");
        float mpg = sc.nextFloat();
        System.out.print("enter average fees: ");
        float avg_fees = sc.nextFloat();
        System.out.print("enter tolls: ");
        float tolls = sc.nextFloat();
        DailyDrivingCost d = new DailyDrivingCost(miles,cost,mpg,avg_fees,tolls);
        System.out.println("the cost of driving daily is: "+d.dailyDrivingCost());
        sc.close();
    }
}
