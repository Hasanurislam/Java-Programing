import java.util.Scanner;

public class Lab17 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=ob.nextInt();
        int a[][]=new int[size][size];
        int b[][]=new int[size][size];
        int c[][]=new int[size][size];

        System.out.print("Enter the elements of the first matrix: ");
        for(int i=0;i<size;i++)//rows
        {
            for(int j=0;j<size;j++)//colums
            {
                a[i][j]=ob.nextInt();
            }
        }
        System.out.print("Enter the elements of the Second matrix: ");
        for(int i=0;i<size;i++)//rows
        {
            for(int j=0;j<size;j++)//colums
            {
                b[i][j]=ob.nextInt();
            }
        }
        System.out.println("First Matrix: ");
        for(int i=0;i<size;i++)//rows
        {
            for(int j=0;j<size;j++)//colums
            {
               System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }

        System.out.println("Second Matrix: ");
        for(int i=0;i<size;i++)//rows
        {
            for(int j=0;j<size;j++)//colums
            {
               System.out.print(b[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("Sum of two Matrix: ");
        for(int i=0;i<size;i++)//rows
        {
            for(int j=0;j<size;j++)//colums
            {
               c[i][j]=a[i][j]+b[i][j];
               System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
