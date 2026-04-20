import java.util.Scanner;

public class lab8_pr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter text: ");
        String text = sc.nextLine();
        char[] te = text.toCharArray();     //if not case sensitive, then text.toLowerCase().toCharArray()

        for(int i=0; i<text.length(); i++)
        {
            if(te[i]=='a' || te[i]=='e' || te[i]=='i' || te[i]=='o' || te[i]=='u')      //in q a,e,i,o,u mention so not making uppercase to lowercase 
            {
                System.out.println("vowel: "+te[i]+" found at index: "+i);
            }
        }

    }
}
