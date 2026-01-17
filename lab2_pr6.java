import java.util.Scanner;
class Credit
{
    String accNum;
    double balance;
    double charge;
    double credits;
    Credit(String accNum, double balance, double charge, double credits)
    {
        this.accNum = accNum;
        this.balance = balance;
        this.charge = charge;
        this.credits = credits;
    }
    double newBalance()
    {
        return (balance + charge - credits);
    }
    void creditLimit()
    {
        if(newBalance()>0)
            System.out.println(" credit limit not exceeded");
        else
            System.out.println(" credit limit exceeded");
    }
}

public class lab2_pr6 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String accNum;
        double balance;
        double charge;
        double credits;
        System.out.print("enter no. of customers: ");
        int n = sc.nextInt();
        Credit c[] = new Credit[n];
        for(int i=0; i<n; i++)
        {
            System.out.print("enter acc number: ");
            accNum = sc.next();
            System.out.print("enter beginning balance: ");
            balance = sc.nextDouble();
            System.out.print("enter total of items charged this month: ");
            charge = sc.nextDouble();
            System.out.print("enter total credits earned: ");
            credits = sc.nextDouble();
            c[i] = new Credit(accNum, balance, charge, credits);
        }
        for(int i=0; i<n; i++)
        {
            System.out.print("for "+c[i].accNum);
            c[i].creditLimit();            
        }
        sc.close();
    }
}
