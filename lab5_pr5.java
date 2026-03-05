import java.util.Scanner;

abstract class Tax
{
    static final double taxRate = 0.15;
    static double calculateTax(double grossPay)
    {
        return grossPay*taxRate;
    }
}

class NetPay
{
    static final double hourlyRate = 12;
    double grossPay;
    double calculateNetPay(double hours)
    {
        grossPay = hourlyRate*hours;
        return grossPay-Tax.calculateTax(grossPay);
    }
}

public class lab5_pr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of hours employee has worked: ");
        double hours = sc.nextDouble();
        NetPay np = new NetPay();

        System.out.println("net pay of employee is: "+np.calculateNetPay(hours));
    }
}
