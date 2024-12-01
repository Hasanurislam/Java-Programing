import java.util.Scanner;

public class Lab15 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=ob.nextInt();

        int[] array1=new int[size];
        int[] array2=new int[size];
        int[] sumarray=new int[size];

        System.out.println("Enter the elements of the first array: ");
        for(int i=0;i<size;i++)
        {
            array1[i]=ob.nextInt();
        }
        System.out.print("Enter the elements of the second array: ");
        for(int i=0;i<size;i++)
        {
            array2[i]=ob.nextInt();
        }

        for(int i=0;i<size;i++)
        {
            sumarray[i]=array1[i]+array2[i];
        }
        System.out.print("Sum of two array: ");
        for(int i=0;i<size;i++)
        {
            System.out.print(sumarray[i]+" ");
        }

    }
    
}
