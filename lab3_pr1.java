import java.util.Scanner;

class Figure
{
    public static final double P=Math.PI;
    double r, a, v;     //radius, area, volume
    Figure(double r)
    {
        this.r = r;
    }     
    public void dispArea()
    {
        System.out.println("area is: "+a);
    } 
    public void dispVolume()
    {
        System.out.println("volume is: "+v);
    }
}
class Cone extends Figure
{
    double h,s;     //height, slanted height
    Cone(double r, double h)
    {
        super(r);
        this.h = h;
        this.s = Math.sqrt((h*h+r*r)); 
    } 

    public void calcArea()
    {
        a = P*r*s + P*r*r;
    }  
    public void calcVolume()
    {
        v = (P*r*r*h)/3;
    }
}

public class lab3_pr1
{
    public static void main(String args[])
    {
        double r,h;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radius of cone: ");
        r = sc.nextDouble();
        System.out.print("enter the height of cone: ");
        h = sc.nextDouble();
        Cone c = new Cone(r, h);
        c.calcArea();
        c.calcVolume();
        c.dispArea();
        c.dispVolume();
        sc.close();
    }
}