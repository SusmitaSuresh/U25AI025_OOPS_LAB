import java.util.Scanner;

interface OldStyleMovieTheatre
{
    static final double TicketPrice = 5;            //all are public static final
    static final double PerformanceCost = 20;
    static final double CostPerAttendee = 0.5;

    double IncomeEarned();      //all are public abstract
    double Expenditure();
    double TotalProfit();
}

class Show implements OldStyleMovieTheatre
{
    int n;
    Show(int n)
    {
        this.n = n;
    }
    public double IncomeEarned()
    {
        return n*TicketPrice;
    }
    public double Expenditure()
    {
        return (PerformanceCost+n*CostPerAttendee);
    }
    public double TotalProfit()
    {
        return IncomeEarned()-Expenditure();
    }
}

public class lab6_pr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of attendees: ");
        int n = sc.nextInt();
        
        Show s = new Show(n);

        System.out.print("total income is: "+s.IncomeEarned()+"\n");
        System.out.print("total profit is: "+s.TotalProfit());
    }
}
