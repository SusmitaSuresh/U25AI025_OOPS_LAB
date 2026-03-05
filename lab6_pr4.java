abstract class Car
{
    abstract void mode();
    abstract void avg();
    void display()      //concrete method
    {
        System.out.println("this is a car");
    }
}

class Maruthi extends Car
{
    void mode()
    {
        System.out.println("Maruthi has standard automatic positions (P, R, N, D, M, L, B) and specialized drive modes like Eco, Sport, and Snow.");
    }
    void avg()
    {
        System.out.println("avg of Maruthi is: "+120);
    }

}

class Santro extends Car
{
    void mode()
    {
        System.out.println("Santro does not feature specialized drive modes (like Eco/Sport)");
    }
    void avg()
    {
        System.out.println("avg of Santro is: "+80);
    }
}

public class lab6_pr4 {     //car1
    public static void main(String[] args) {
        Car m = new Maruthi();      //creating object of subclass but reference to abstract class
        Car s = new Santro();
        m.display();
        m.avg();
        m.mode();
        s.display();
        s.avg();
        s.mode();
    }
    
}
