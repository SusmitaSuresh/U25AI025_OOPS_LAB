import java.util.Scanner;       //we can also used BufferedReader() to read from console

public class lab8_pr1 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter text: ");
        String text = sc.nextLine();

        System.out.println("the first occurence of 'the' is at position: "+text.indexOf("the"));
        System.out.println("the last occurence of 'the' is at position: "+text.lastIndexOf("the"));

        String copy = text.substring(text.indexOf("the"), text.lastIndexOf("the"));

        System.out.println("test in bw those positions is: "+copy);

        sc.close();
    }
}
