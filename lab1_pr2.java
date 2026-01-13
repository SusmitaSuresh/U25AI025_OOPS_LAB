import java.util.Scanner;
public class lab1_pr2 {
    //PATH is an environment variable that tells the OS where it can find excecutable programs like javac, java etc.
    //If path isn't set correctly in system, we must type the path as the command
    //ex: javac hello.java is now "C:\Program Files\Java\jdk\bin\javac" Hello.java

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //initialising scanner
        System.out.println("enter a number: ");
        int n1=sc.nextInt();
        System.out.println("enter a number: ");
        int n2=sc.nextInt();
        if(n1>n2)
            System.out.println(n1+" is larger");
        else if(n2>n1)
            System.out.println(n2+" is larger");
        else
            System.out.println("the numbers are equal");
        sc.close();
    }
}
