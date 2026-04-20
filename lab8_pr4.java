import java.util.Scanner;

public class lab8_pr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter text: ");
        String text = sc.nextLine();
        char[] te = text.toCharArray(); 

        char c = ' ';
        for(int i=-1; i<text.length()-1; i++)
        {
            if(i!=-1)
            {
                c = te[i];
            }
            if(c == ' ' && (te[i+1]>='a'&&te[i+1]<='z'))
            {
                te[i+1] = (char)(te[i+1] - (char)32);
            }
        }
        text = String.valueOf(te);
        System.out.println("result string is: "+text);
    }
}
