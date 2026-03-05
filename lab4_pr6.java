
/*Q.6)Declare an interface called Function that has a method named evaluate that takes an int parameter and
returns an int value.Create a class Half that implements Function. Make the implementation of the method
evaluate() return the value obtained by dividing the int argument by 2.In a client, create a method that takes an
arbitrary array of int values as parameter and returns an array that has the same length, but the value of an
element in the new array is half that of the value in the corresponding element in the array passed as parameter.
Let the implementation of this method create an instance of Half and use this instance to calculate the values in
the array to be returned. */

interface Function
{
    public abstract int evaluate(int value);
}

class Half implements Function
{
    public int evaluate(int value)
    {
        return value/2;
    }
}

class Client
{
    public int[] array(int array[])
    {
        Half h = new Half();
        for(int i=0; i<array.length; i++)
        {
            array[i] = h.evaluate(array[i]);
        }
        return array;
    }
}


public class lab4_pr6 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        Client h = new Client();
        for(int i=0; i<array.length; i++)
        {
            System.out.print(array[i]+"\t");
        }
        System.out.println("");
        array = h.array(array);
        for(int i=0; i<array.length; i++)
        {
            System.out.print(array[i]+"\t");
        }
    }
}
