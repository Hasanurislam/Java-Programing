import java.util.*;

public class Q35 {
    public static void main(String[] args) {
        int a[]=new int[5];
        System.out.println("Enter the array elements: ");
        Scanner r=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.println("The array elements:");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.print("The length of array: "+a.length);
        
        
    }
    
}
