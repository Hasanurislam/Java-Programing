import java.util.Scanner;
public class Q38 {
    public static void main(String[] args) {
        int a[]=new int[6];
        int key,count=0;
        System.out.print("Enter The Array Elements:");
        Scanner r=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.println("The Array Elements are: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] +" ");
        }
        System.out.println("\nEnter the to search:");
        key=r.nextInt();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==key)
            {
                count++;
            }
        }
            if(count>0)
            {
                System.out.print("Item Found");
            }
            else
            {
                System.out.print("Item Not Found");
            }
        
        
    }
    
}
