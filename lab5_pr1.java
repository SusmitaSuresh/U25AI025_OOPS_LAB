interface QueueImpl
{
    void insert(int data);
    void delete();
    void display();
}

class UnderflowException extends Exception
{
    UnderflowException() 
    {
        super("underflow, i.e. queue is empty");
    }
}

class OverflowException extends Exception
{
    OverflowException() 
    {
        super("Overflow, i.e. queue is full");
    }
}

class QueueDemo implements QueueImpl
{
    int[] queue = new int[10];
    int front = -1;
    int rear = -1;
    public void insert(int data)
    {
        if(rear == -1)
        {
            front = 0;
            rear = 0;
            queue[rear] = data;
        }
        else
        {
            try
            {
                if(rear == 9)       //overflow as last element filled
                {
                    throw new OverflowException();
                }
                else
                {
                    rear++;
                    queue[rear] = data;
                }
            }
            catch(OverflowException ex)
            {
                ex.printStackTrace();
            }
        }
    }
    public void delete()
    {
        try
        {
            if(front == -1)
            {
                throw new UnderflowException();
            }
            else if(front == rear)
            {
                front = -1;
                rear = -1;
            }
            else
            {
                front++;
            }
        }
        catch(UnderflowException ex)
        {
            ex.printStackTrace();
        }
    }
    public void display()
    {
        try
        {
            if(front == -1)
            {
                throw new UnderflowException();
            }
            else
            {
                for(int i=front; i<=rear; i++)
                {
                    System.out.print(queue[i]+"\t");
                }
                System.out.println();
            }
        }
        catch(UnderflowException ex)
        {
            ex.printStackTrace();
        }
    }
}

public class lab5_pr1 {
    public static void main(String[] args) {
        QueueDemo qd = new QueueDemo();
        qd.insert(1);
        qd.insert(2);
        qd.insert(3);
        qd.insert(4);
        qd.insert(5);
        qd.insert(6);

        qd.display();       //queue is 1 2 3 4 5 6

        qd.insert(7);
        qd.insert(8);
        qd.insert(9);
        qd.insert(10);      //queue is 1 2 3 4 5 6 7 8 9 10
        qd.insert(11);      //overflow
        qd.insert(12);      //overflow

        qd.delete();
        qd.delete();
        qd.delete();
        qd.delete();
        qd.delete();
        qd.delete();

        qd.display();       //queue is 7 8 9 10

        qd.delete();
        qd.delete();
        qd.delete();
        qd.delete();
        qd.delete();        //underflow
        qd.delete();        //underflow

        qd.display();       //underflow

    }
}
