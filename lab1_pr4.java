import java.util.Scanner;
class Operations{
    double pi= Math.PI;
    void diameter(int r)
    {
        System.out.println("diameter is: "+2*r);
    }
    void circumference(int r)
    {
        System.out.println("circumference is: "+2*pi*r);
    }
    void area(int r)
    {
        System.out.println("area is: "+pi*r*r);
    }
}
public class lab1_pr4 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius:");
        int r=sc.nextInt();
        Operations object = new Operations();
        object.diameter(r);
        object.circumference(r);
        object.area(r);
    }
}
