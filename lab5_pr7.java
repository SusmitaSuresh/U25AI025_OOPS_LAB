import java.util.Scanner;

enum Result
{
    CORRECT, WRONG, UNANSWERED;     //0,1,2
}

class PassOrNot
{
    int cac=0, wac=0, uac=0;                  //correct answer count, wrong answer count, unanswered answer count
    int i=0;                             
    void count(Result[] answers)
    {
        for(int i=0; i<8; i++)
        {
            if(answers[i] == Result.CORRECT)
            {
                cac++;
            }
            else if(answers[i] == Result.WRONG)
            {
                wac++;
            }
            else
            {
                uac++;
            }
        }
    }
    void displayReport(char[] ans, Result[] answers, char c[])
    {
        count(answers);
        System.out.println("Question\tSubmitted ans\tCorrect ans\tResult");
        for(int i=0; i<8; i++)
        {
            System.out.println((i+1)+".\t\t"+c[i]+"\t\t"+ans[i]+"\t\t"+answers[i]);
        }
        System.out.println("no of correct ans: "+cac);
        System.out.println("no of wrong ans: "+wac);
        System.out.println("no of unanswered qs: "+uac);
        if(cac>4)
        {
            System.out.println("The student has PASSED");
        }
        else
        {
            System.out.println("The student has FAILED");
        }
    }
}

public class lab5_pr7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c[] = new char[8];
        char[] ans = {'C','A','B','D','B','C','C','A'};   //manually declaring the correct answers in an array 
        Result[] answers = new Result[8];
        System.out.println("enter 8 questions answers, A, B, C, D, or X for no answer: ");
        for(int i=0; i<8; i++)
        {
            c[i] = Character.toUpperCase(sc.next().charAt(0));
            if(c[i] == ans[i])
            {
                answers[i] = Result.CORRECT;
            }
            else if(c[i] == 'X')
            {
                answers[i] = Result.UNANSWERED;
            }
            else
            {
                answers[i] = Result.WRONG;
            }
        }
        PassOrNot p = new PassOrNot();
        p.displayReport(ans, answers, c);
    }
}
