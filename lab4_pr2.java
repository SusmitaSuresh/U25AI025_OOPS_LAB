/*Q.2) We need to write the function to check the password entered is correct or not based on the following
conditions.
a) It must have atleast one lower case character and one digit.
b) It must not have any Upper case characters and any special characters
c) length should be b/w 5-12.
d) It should not have any same immediate patterns like
abcanan1 : not acceptable coz of an an pattern
abc11se: not acceptable, coz of pattern 11
123sd123 : acceptable, as not immediate pattern
adfasdsdf : not acceptable, as no digits
Aasdfasd12: not acceptable, as have uppercase character */

import java.util.Scanner;

class IsYourPasswordValid
{
    String p;
    IsYourPasswordValid(String p)
    {
        this.p = p;
    }
    void isYourPasswordValid() 
    {
        int lcc=0, dc=0; //lower case count and digit count
        if(p.length()>12 || p.length()<5)
        {
            System.out.println("invalid length");
            return;
        }
        for(char c: p.toCharArray())
        {
            if(!(c>96 && c<123) && !(c>47 && c<58))     //not lower case and not digit
            {
                System.out.print("not acceptable due to special characters or upper case letters");
                return;
            }
            if(c>96 && c<123)   //lower case
            {
                lcc++;
            }
            if(c>47 && c<58)    //digit
            {
                dc++;
            }
        }
        if(lcc == 0)
        {
            System.out.print("not acceptable, as no lower case letter");
            return;
        }
        if(dc == 0)
        {
            System.out.print("not acceptable, as no digits");
            return;
        }
        for(int i=1; i<=p.length()/2; i++)       //we need to check every length of patters until n/2 to see if patterns exist
        {
            for(int j=0; j+2*i<=p.length(); j++)
            {
                String s1 = p.substring(j, j+i);       //we take each substring of i length and compare to  
                String s2 = p.substring(j+i, j+2*i);  //the next i length substring from 0 to n
                if (s1.equals(s2) == true) 
                {
                    System.out.println("Not acceptable cause of pattern " + s1 +" "+ s2);
                    return;
                }
            }
        }
        System.out.println("valid password👍");
    }
}

public class lab4_pr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a password: ");
        String p = sc.next();
        IsYourPasswordValid pass = new IsYourPasswordValid(p);
        pass.isYourPasswordValid();
    }
}
