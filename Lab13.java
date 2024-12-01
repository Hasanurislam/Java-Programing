import java.util.Scanner;

class ArrayReverse{
    int[] array;
    ArrayReverse(int[] arr)
    {
        this.array=arr;
        //print array elements in reverse order
        System.out.println("Array elements in reverse order: ");
        for(int i=array.length-1;i>=0;i--)
        {
            System.out.print(array[i]+" ");
        }

    }
}
public class Lab13 {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner ob=new Scanner(System.in);
        int size=ob.nextInt();
        int[] arr=new int[size];
        System.out.print("Enter the array elements:");
        for(int i=0;i<size;i++)
        {
            arr[i]=ob.nextInt();
        }

        ArrayReverse ref=new ArrayReverse(arr);

    }
    
}
