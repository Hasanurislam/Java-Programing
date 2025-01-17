import java.util.Scanner;

public class Lab17 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter the size of the rows: ");
        int rows=ob.nextInt();
        System.out.print("Enter the size of the column: ");
        int column=ob.nextInt();
        int a[][]=new int[rows][column];
        int b[][]=new int[rows][column];
        int c[][]=new int[rows][column];

        System.out.print("Enter the elements of the first matrix: ");
        for(int i=0;i<rows;i++)//rows
        {
            for(int j=0;j<column;j++)//colums
            {
                a[i][j]=ob.nextInt();
            }
        }
        System.out.print("Enter the elements of the Second matrix: ");
        for(int i=0;i<rows;i++)//rows
        {
            for(int j=0;j<column;j++)//colums
            {
                b[i][j]=ob.nextInt();
            }
        }
        System.out.println("First Matrix: ");
        for(int i=0;i<rows;i++)//rows
        {
            for(int j=0;j<column;j++)//colums
            {
               System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }

        System.out.println("Second Matrix: ");
        for(int i=0;i<rows;i++)//rows
        {
            for(int j=0;j<column;j++)//colums
            {
               System.out.print(b[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("Sum of two Matrix: ");
        for(int i=0;i<rows;i++)//rows
        {
            for(int j=0;j<column;j++)//colums
            {
               c[i][j]=a[i][j]+b[i][j];
               System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
