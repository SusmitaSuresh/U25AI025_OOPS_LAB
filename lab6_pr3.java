import java.util.Scanner;

class WashingMachine
{
    static int OnOrOff = 0;
    static boolean detergentIn = false;
    static int TotalClothes = 0;
    void SwitchOn()
    {
        if(OnOrOff==1)
        {
            System.out.println("Already ON");
        }
        else
        {
            OnOrOff = 1;
            System.out.println("It is ON now");
        }
    }

    void SwitchOff()    
    {
        if(OnOrOff==0)
        {
            System.out.println("Already OFF");
        }
        else
        {
            OnOrOff = 0;
            System.out.println("It is OFF now");
        }
    }

    void acceptClothes(int n)
    {
        if(OnOrOff==0)
        {
            TotalClothes = TotalClothes + n;
            System.out.println("total number of clothes are: "+n);
        }
        else
        {
            System.out.println("washing machine is ON, clothes cannot be accepted");
        }
    }

    void acceptDetergent()
    {
        if(OnOrOff == 0)
        {
            if(detergentIn==false)
            {
                System.out.println("detergent accepted");
                detergentIn = true;
            }
            else
            {
                System.out.println("detergent already in");
            }
        }
        else
        {
            System.out.println("washing machine is ON, detergent cannot be accepted");
        }
    }


}

public class lab6_pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        WashingMachine wm = new WashingMachine();
        wm.SwitchOn();
        wm.acceptDetergent();
        wm.SwitchOff();
        wm.acceptDetergent();
        System.out.print("enter number of clothes to add: ");
        int n = sc.nextInt();
        wm.acceptClothes(n);
        wm.acceptDetergent();
        System.out.print("enter number of clothes to add: ");
        n = sc.nextInt();
        wm.acceptClothes(n);
        wm.SwitchOn();
        wm.SwitchOff();
        System.out.println("no. of clothes washed: "+wm.TotalClothes);
    }
}
