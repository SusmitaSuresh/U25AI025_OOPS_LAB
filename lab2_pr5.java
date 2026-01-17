/*Q5.)(Gas mileage ) Drivers are concerned with the mileage theit automobiles get. One driver has kept track of
several trips by recording the miles driven and gallons used for each tankful.Develop a java application that will
input the miles driven and gallons used(both as in) for each trip.The program should calculate and display the
miles per gallon obtained for each trip and print the combined miles per gallon obtained for all trips up to this
point. All averaging calculate should produce floating point results. Use class scanner and sentinel-controlled
repetition to obtain the data from the user.*/
import java.util.Scanner;
class GasMileage
{
    int miles;
    int gallons;
    static int totalMiles = 0;
    static int totalGallons = 0;
    GasMileage(int miles,int gallons)
    {
        super();
        this. miles= miles;
        this.gallons = gallons;
        totalMiles = totalMiles + miles;
        totalGallons = totalGallons + gallons;
    }
    double milesPerGallon()
    {
        return (double)miles/gallons;
    }
}
public class lab2_pr5 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String []args)
    {
        int miles, gallons, n=0;
        Scanner sc = new Scanner(System.in);
        while(n!=-1)
            {
                System.out.print("enter no of miles: ");
                miles = sc.nextInt();
                System.out.print("enter no of gallons: ");
                gallons = sc.nextInt();
                GasMileage a = new GasMileage(miles, gallons);
                System.out.println("miles per gallon in this trip is: "+a.milesPerGallon());
                System.out.print("enter -1 to exit, else any other number: ");
                n = sc.nextInt();
            }
        double combinedMilesPerGallon = (double)GasMileage.totalMiles/GasMileage.totalGallons;
        System.out.print(combinedMilesPerGallon);
        sc.close();
    }
}
