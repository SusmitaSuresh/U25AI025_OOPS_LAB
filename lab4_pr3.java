import java.util.Scanner;
public class lab4_pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string (only lower case letters please): ");
        String st = sc.nextLine();
        System.out.print("enter the max limit of times a character can occur: ");
        int n = sc.nextInt();
        int co[] = new int[26];
        char s[] = new char[st.length()];
        s = st.toCharArray();
        for(char c:s)
        {
            co[c - 97]++;
        }
        for(int i=0; i<26; i++)
        {
            if(co[i]>n)
            {
                System.out.println("the character '"+ (char)(i+97)+ "' exceeded the limit by "+ (co[i]-n));
            }
        }
        sc.close();
    }
}
