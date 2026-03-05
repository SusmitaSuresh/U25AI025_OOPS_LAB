import java.util.Scanner;

class NotHexadecimal extends Exception
{
    NotHexadecimal() 
    {
        super("This is not a hexadecimal number");
    }
}


public class lab5_pr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        System.out.print("enter a hexadecimal number: ");
        String s = sc.nextLine();
        for(char c : s.toCharArray())
        {
            try
            {
                if(! ((c>='0' && c<='9') || (c>='a' && c<='f') || (c>='A' && c<='F')))   //if its not digit or a to f  then it is not hexadecimal number
                {
                    flag = false;
                    throw new NotHexadecimal();
                }
            }
            catch(NotHexadecimal ex)
            {
                ex.printStackTrace();
            }
        }
        if(flag)
        {
            System.out.print("it is hexadecimal: ");
        }
        System.out.println(s);
        System.out.println("program end");
    }
}
