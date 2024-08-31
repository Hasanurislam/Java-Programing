import java.util.Scanner;
import java.util.Arrays;
public class Q43 {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the array element: ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        int a2[]=Arrays.copyOf(a, 5);
        for(int i=0;i<a2.length;i++)
        {
            System.out.print(a2[i] +" ");
        }
    }
    
}
