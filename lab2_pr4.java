import java.util.Scanner;
class Date{
    int day, month, year;
    Date()
    {
        super();
    }
    void setDay(int day)
    {
        this.day = day;
    }
    void setMonth(int month)
    {
        this.month = month;
    }
    void setYear(int year)
    {
        this.year = year;
    }
    int getDay()
    {
        return day;
    }
    int getMonth()
    {
        return month;
    }
    int getYear()
    {
        return year;
    }
    void DisplayDate()
    {
        System.out.println(day+"/"+month+"/"+year);
    }    
}
public class lab2_pr4 {
    public static void main(String []args)
    {   
        Scanner sc = new Scanner(System.in);
        Date d = new Date();
        System.out.print("enter the day: ");
        int day = sc.nextInt();
        d.setDay(day);
        System.out.print("enter the month: ");
        int month = sc.nextInt();
        d.setMonth(month);
        System.out.print("enter the year: ");
        int year = sc.nextInt();
        d.setYear(year);
        System.out.println("day:"+d.getDay()+" month:"+d.getMonth()+" year:"+d.getYear());
        d.DisplayDate();
        sc.close();
    }
}
