/*Q.6) Create a class to model a point in 3D space. Data members x,y,z as coordinate of 3D point are of type int.
Constructors: To create 3D point represented the origin arbitrary point. Methods:
 i/p the coordinates of 3D point.
 o/p the coordinate of 3D point in the form(x,y,z).
 Compute distance between two points. */
import java.util.Scanner;

class ThreeDimensionalPoint
{
    double x, y, z;
    void input(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    void output()
    {
        System.out.println("coordinates are: ("+x+", "+y+", "+z+")");
    }
    double distance(ThreeDimensionalPoint p)
    {
        return Math.sqrt(Math.pow((x-p.x),2) + Math.pow((y-p.y), 2)+ Math.pow((z-p.z),2));
    }
}

public class lab6_pr6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter x, y and z coordinates: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double z1 = sc.nextDouble();
        ThreeDimensionalPoint p1 = new ThreeDimensionalPoint();
        p1.input(x1, y1, z1);
        p1.output();

        System.out.print("enter x, y and z coordinates: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double z2 = sc.nextDouble();
        ThreeDimensionalPoint p2 = new ThreeDimensionalPoint();
        p2.input(x2, y2, z2);
        p2.output();

        System.out.println("distance between the points are: "+p1.distance(p2));
    }
}
