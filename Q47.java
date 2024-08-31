import java.util.*;
public class Q47 {
    public static void main(String[] args) {
        int size,loc,item;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        size=r.nextInt();
        int a[]=new int[size+1];
        System.out.print("Enter the Array Elements: ");
        
        for(int i=0;i<size;i++)
        {
            a[i]=r.nextInt();
        }
        
        System.out.print("Enter the location: ");
        loc=r.nextInt();
        System.out.print("Enter the Item to insert: ");
        item=r.nextInt();

        for(int i=size;i>loc;i--)
        {
            a[i]=a[i-1];
        }
        a[loc]=item;
        size++;
        System.out.print("After inserting into Array: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
    
}
