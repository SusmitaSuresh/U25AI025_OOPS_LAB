import java.util.Scanner;
    
interface Operation{    //interface contains method declarations
    void sum();
    void avg();
    void prod();
    void largest();
    void smallest();
}
abstract class Numbers implements Operation{    //we can't create objects of this class
    int a,b,c;                                  //parent class to other classes
    Numbers(int a, int b, int c)                //methods don't need to be implemented here hence it is flexible
    {                                           //ex: diff child classes can have diff ways to implement abstract method
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
class NumbOper extends Numbers{
    NumbOper(int a, int b, int c){
        super(a, b, c);                         //creates constructor to get values a,b,c from Numbers class (still dk why its not there automatically as its child and inherits::NOT TAUGHT YET)
    }
    public void sum()
    {
        System.out.println("sum is: "+(a+b+c));
    }
    public void avg()
    {
        System.out.println("avg is: "+(a+b+c)/3);
    }
    public void prod()
    {
        System.out.println("prod is: "+(a*b*c));
    }
    public void largest()
    {
        if(a>b && a>c)
            System.out.println("a is greatest");
        else if(b>a && b>c)
            System.out.println("b is greatest");
        else
            System.out.println("c is greatest");                 
    }
    public void smallest()
    {
        if(a<b && a<c)
            System.out.println("a is smallest");
        else if(b<a && b<c)
            System.out.println("b is smallest");
        else
            System.out.println("c is smallest");
    }
}
public class lab1_pr3 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);    //initialising scanner
        System.out.println("enter a: ");
        int n1=sc.nextInt();
        System.out.println("enter b: ");
        int n2=sc.nextInt();
        System.out.println("enter c: ");
        int n3=sc.nextInt();  
        NumbOper object = new NumbOper(n1,n2,n3);  
        object.sum();
        object.avg();
        object.prod();
        object.largest();
        object.smallest();  
        sc.close();  
    }
}

