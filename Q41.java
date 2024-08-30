import java.util.Arrays;
import java.util.Scanner;

public class Q41 {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the array elements: ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        Arrays.sort(a);
        System.out.print("After sorting the array: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] +" ");
        }
    }
    
}
