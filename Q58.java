import java.util.Scanner;

public class Q58 {
    public static void main(String[] args) {
        System.out.print("Enter the first Array Elements:");
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int s[][]=new int[3][3];
        Scanner r=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=r.nextInt();
            }
        }
        System.out.print("Enter the second Array Elements: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                b[i][j]=r.nextInt();
            }
        }
        System.out.print("First Matrix:\n");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("Second Matrix:\n ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("Addition of two matrix: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                s[i][j]=a[i][j]+b[i][j];
            }
            
        }
    }
    
}
