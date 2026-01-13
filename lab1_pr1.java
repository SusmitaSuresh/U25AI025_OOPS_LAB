import java.util.Scanner;  //importing package which has Scanner class.
public class lab1_pr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //initialising scanner
        System.out.println("enter a number: ");
        int n1=sc.nextInt();
        System.out.println("enter a number: ");
        int n2=sc.nextInt();
        System.out.println("sum is: "+(n1+n2)+", product is: "+(n1*n2)+" , difference is: "+(n1-n2)+" quotient is: "+(n1/n2));
        sc.close();
    }
}
