import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        int s,i;
        System.out.print("Enter the size of array: ");
        Scanner ref=new Scanner(System.in);
        s=ref.nextInt();
        int a[]=new int [s]; 
        for(i=0;i<s;i++)
        {
            a[i]=ref.nextInt();
        }
        System.out.println("The array elements: ");
        for(i=0;i<s;i++)
        {
            System.out.print(a[i]);
        }
    }
    
}
