import java.util.Scanner;

public class lab4_pr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string (only lower case letters please): ");
        String st = sc.nextLine();
        int co[] = new int[26];
        int flag=0;
        char s[] = new char[st.length()];
        s = st.toCharArray();
        for(char c:s)
        {
            co[c - 97]++;
        }
        for(int i=0; i<26; i++)
        {
            if(co[i]==1)
            {
                flag++;
            }
        }
        if(flag==26)
        {
            System.out.println("it is perfect string");
        }
        else
        {
            System.out.println("it is not perfect string");
        }
        sc.close();
    }
}
