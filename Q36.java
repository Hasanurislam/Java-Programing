import java.util.Scanner;
public class Q36 {
    public static void main(String[] args) {
        int a[]=new int[5];
        int b[]=new int[5];
        System.out.println("Enter the First array element: ");
        Scanner r=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.println("First array element: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.print("\nThe second array element: ");
    
        for(int i=0;i<b.length;i++)
        {
            b[i]=a[i];
            System.out.println(b[i]);
        }
    }
    
}
