import java.util.*;
public class Q48 {
    public static void main(String[] args) {
        int size,loc;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        size=r.nextInt();
        int a[]=new int[size];
        System.out.print("Enter the Array Elements: ");
        
        for(int i=0;i<size;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.print("Enter the location: ");
        loc=r.nextInt();
        for(int i=loc;i>size-1;i++)
        {
            a[i]=a[i+1];
        }
        size--;
        
        System.out.print("After Deleting the item");
        for(int i=0;i<size;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
    
}
