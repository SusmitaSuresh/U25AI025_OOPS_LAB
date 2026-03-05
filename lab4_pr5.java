import java.util.Scanner;

class DoesPatterExist
{
    int ll, ul;
    String p;
    DoesPatterExist(int ll, int ul, String p) 
    {
        this.ll = ll;
        this.ul = ul;
        this.p = p;
    }
    int doesPatterExist()
    {
        int co=0;
        int pl = p.length(); //patter length
        for(int i=ll; i<=ul; i++)
        {
            String s1 = Integer.toString(i);
            for(int j=0; j+pl<s1.length(); j++)
            {
                String s2 = s1.substring(j, j+pl);  //the next i length substring from 0 to n
                if (s2.equals(p) == true) 
                {
                    co++;
                }
            }
        }
        return co;
    }
}

public class lab4_pr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a range (lower no. and higher no.): ");
        int ll = sc.nextInt();  //lower limit
        int ul = sc.nextInt();  //upper limit

        System.out.print("enter the pattern: ");
        String p = sc.next();
        
        DoesPatterExist dpe = new DoesPatterExist(ll, ul, p);
        System.out.println(" patter exists: "+dpe.doesPatterExist()+ " no. of times");
    }
}
