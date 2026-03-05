/*Q.1). Demonstrate the use of ‘super’ and this keyword(constructor changing)
a) To refer to a member of super class.
b) To call super class constructor from sub class constructor. */

class A
{
    int a;
    A(int a)
    {
        this.a = a;
    }
    void show()
    {
        System.out.println("value is: "+a);
    }
}

class B extends A
{
    int b;
    B(int a, int b)
    {
        super(a);
        this.b = b;
    }
    void info()
    {
        System.out.println("value 2 is: "+b);
    }
}


public class lab6_pr1 {
    public static void main(String[] args) {
        A a = new A(1);
        a.show();
        A a1 = new B(3,4);
        a1.show();
        //a1.info();  this wont work as show isnt present in A  
        B b = new B(10,20);
        b.show(); //MEMBER OF A IS ACCESSED USING B
        b.info();
    }
}
