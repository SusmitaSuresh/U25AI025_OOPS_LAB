/*Q.5) Create a Bank class with methods deposit & withdraw. The deposit method would accept attributes amount
& balance & returns the new balance which is the sum of amount & balance. Similarly, the withdraw method
would accept the attributes amount & balance & returns the new balance ‘balance – amount’ if balance > =
amount or return 0 otherwise. */

class Bank
{
    void deposit(double amount, double balance)
    {
        System.out.println("new balance is: "+ (amount + balance));
    }
    void withdraw(double amount, double balance)
    {
        if(amount>balance)
        {
            System.out.println("new balance is: "+ 0.0);
        }
        else
        {
            System.out.println("new balance is: "+ (balance - amount));
        }
    }
}

public class lab6_pr5 {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.deposit(100, 150);
        b.withdraw(300, 250);
        b.withdraw(200, 250);
    }
}
