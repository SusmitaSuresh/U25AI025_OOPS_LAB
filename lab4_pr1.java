import java.util.Scanner;
/*Q.1) Write a function to give demostrate the functionality of 3D matrix in 1D matirx. Function prototye:
void set (int value,int indexX,int indexY,int indexZ, int [] 1dArray);
void get (int value,int indexX,int indexY,int indexZ, int [] 1dArray). */

class ThreeDimensionalArray
{
    int r,c,m;
    ThreeDimensionalArray(int r, int c, int m) 
    {
        this.r = r;
        this.c = c;
        this.m = m;
    }
    
    void set(int value,int indexX,int indexY,int indexZ, int [] onedArray)
    {
        if(indexX>=r ||indexY>=c ||indexZ>=m || indexX<0 || indexY<0 || indexZ<0)
        {
            System.out.println("invaid index");
            return;
        }
               
        int index;
        index = indexZ*(r*c) + indexY*c +indexX;
        onedArray[index] = value;
    }
    int get(int indexX,int indexY,int indexZ, int [] onedArray)
    {
        if(indexX>=r ||indexY>=c ||indexZ>=m)
        {
            System.out.println("invaid index");
            return 0;
        }
        int index;
        index = indexZ*(r*c) + indexY*c +indexX;
        return onedArray[index];
    }
}

public class lab4_pr1 {
    public static void main(String[] args) {
        //with x, y, and z index we need to update the 1d array. 1d-array index = (z*(r*c)+y*c+x)
        Scanner sc = new Scanner(System.in);
        int r,c,m;
        System.out.print("enter number of rows, columns, and matrixes: ");
        r = sc.nextInt();
        c = sc.nextInt();
        m = sc.nextInt();

        ThreeDimensionalArray t = new ThreeDimensionalArray(r,c,m);

        int onedArray[] = new int[r*c*m];

        t.set(1,0,0,0,onedArray);
        t.set(2,0,1,0,onedArray);
        t.set(3,2,0,0,onedArray);
        t.set(4,1,0,5,onedArray);
        t.set(5,4,0,0,onedArray);

        System.out.println(t.get(0,0,0,onedArray));
        System.out.println(t.get(0,1,0,onedArray));


        
    }
}
