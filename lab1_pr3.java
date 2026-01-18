import java.util.Scanner;
    
interface Operation{    //interface contains method declarations
    void sum();         //these are implicitly public abstract 
    void avg();         //an interface cannot have interface variables except 'public static final' (that are used in methods ig)
    void prod();
    void largest();
    void smallest();
}
abstract class Numbers implements Operation{    //we can't create objects of this class
    int a,b,c;                                  //parent class to other classes
    Numbers(int a, int b, int c)                //methods don't need to be implemented here hence it is flexible (here i have implemented)
    {                                           //ex: diff child classes can have diff ways to implement abstract method
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public void sum()           //it is safe to add @override notation here as it is replacing the declaration of interface here (usually used in inheritance)
    {
        System.out.println("sum is: "+(a+b+c));
    }
    @Override
    public void avg()
    {
        System.out.println("avg is: "+(a+b+c)/3.0);
    }
    @Override
    public void prod()
    {
        System.out.println("prod is: "+(a*b*c));
    }
    @Override
    public void largest()
    {
        if(a>b && a>c)
            System.out.println("a is greatest");
        else if(b>a && b>c)
            System.out.println("b is greatest");
        else
            System.out.println("c is greatest");                 
    }
    @Override
    public void smallest()
    {
        if(a<b && a<c)
            System.out.println("a is smallest");
        else if(b<a && b<c)
            System.out.println("b is smallest");
        else
            System.out.println("c is smallest");
    }
    @SuppressWarnings("unused")     //this warning is generated as i didnt use this function within this class
    abstract void randomFunction();     //in different classes, it can have diff bodies (sim to an interface function)
}
class NumbOper extends Numbers{
    NumbOper(int a, int b, int c){
        super(a, b, c);               //creates constructor to get values a,b,c from Numbers class (still dk why its not there automatically as its child and inherits)
    }                                 //super is needed as constructors are not inherited so they need to be called
    @Override
    void randomFunction()
    {
        System.out.print("this program has an interface for method initialisations, ");
        System.out.print("an abstract class as a blueprint for further classes, ");
        System.out.print("and this class which inherits all the properties from the abstract class ");
    }
}
public class lab1_pr3 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);    //initialising scanner
        System.out.print("enter a: ");
        int n1=sc.nextInt();
        System.out.print("enter b: ");
        int n2=sc.nextInt();
        System.out.print("enter c: ");
        int n3=sc.nextInt();  
        NumbOper object = new NumbOper(n1,n2,n3);  
        object.sum();
        object.avg();
        object.prod();
        object.largest();
        object.smallest(); 
        object.randomFunction(); 
        sc.close();  
    }
}
