import java.util.Scanner;
public class lab1_pr5 {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a five digit number: ");    //println will make it go to next line
        int num = sc.nextInt();
        int n = 0;
        while(num!=0)
        {
            n = n*10 + num%10;
            num = num/10;
        }
        while(n!=0)
        {
            System.out.print(n%10+"   ");
            n= n/10;
        }
    }
}
