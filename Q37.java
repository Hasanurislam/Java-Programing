//sum of Array element
import java.util.Scanner;
public class Q37 {
    public static void main(String[] args) {
        int a[]=new int[6];
        int sum=0;
        System.out.print("Enter Array Element: ");
        Scanner r=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.println("The Array Elements are: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("The sum of Array Elements: "+sum);

        
    }
    
}
