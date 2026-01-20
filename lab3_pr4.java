package FigPackage;
//to compile this file, type javac FigPackage\lab3_pr4.java in the terminal
//to execute the class file, type FigPackage.lab3_pr4 in the terminal
import java.util.Scanner;

abstract class Figure
{
    double pi = 3.1420;
    public abstract void calcArea();
    public abstract void calcVol();
    public abstract void dispArea();
    public abstract void dispVol();
}
class Cone extends Figure
{
    double r, h, s, a, v;
    Cone(double r, double h)
    {
        this.r = r;
        this.h = h;
        this.s = Math.sqrt(h*h+r*r);
    }
    public void calcArea()
    {
        a = pi*r*s + pi*r*r;
    }
    public void calcVol()
    {
        v = (pi*r*r*h)/3;
    }
    public void dispArea()
    {
        System.out.println("area of cone is: "+a);
    }
    public void dispVol()
    {
        System.out.println("volume of cone is: "+v);
    }
}
class Sphere extends Figure
{
    double r, a, v;
    Sphere(double r)
    {
        this.r = r;
    }
    public void calcArea()
    {
        a = 4*pi*r*r;
    }
    public void calcVol()
    {
        v = (4*pi*r*r*r)/3;
    }
    public void dispArea()
    {
        System.out.println("area of sphere is: "+a);        
    }
    public void dispVol()
    {
        System.out.println("volume of sphere is: "+v);        
    }
}
class Cylinder extends Figure
{
    double r, h, a, v;
    Cylinder(double r, double h)
    {
        this.r = r;
        this.h = h;
    }
    public void calcArea()
    {
        a = (2*pi*r*r) + (2*pi*r*h);
    }
    public void calcVol()
    {
        v = pi*r*r*h;
    }
    public void dispArea()
    {
        System.out.println("area of cylinder is: "+a);
    }
    public void dispVol()
    {
        System.out.println("volume of cylinder is: "+v);        
    }
}
public class lab3_pr4 {
    public static void main(String[] args) 
    {
        double r, h;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radius of cone: ");
        r = sc.nextDouble();
        System.out.print("enter the height of cone: ");
        h = sc.nextDouble();
        Cone co = new Cone(r,h);
        co.calcArea();
        co.calcVol();
        co.dispArea();
        co.dispVol();

        System.out.print("enter the radius of sphere: ");
        r = sc.nextDouble();
        Sphere sp = new Sphere(r);
        sp.calcArea();
        sp.calcVol();
        sp.dispArea();
        sp.dispVol();

        System.out.print("enter the radius of cylinder: ");
        r = sc.nextDouble();
        System.out.print("enter the height of cylinder: ");
        h = sc.nextDouble();
        Cylinder cy = new Cylinder(r,h);
        cy.calcArea();
        cy.calcVol();
        cy.dispArea();
        cy.dispVol();

        sc.close();
    }
}
