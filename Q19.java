import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
         int num;
         System.out.print("Enter a number: ");
         Scanner r=new Scanner(System.in);
         num=r.nextInt();
         if (num>1) {
            System.out.println("Entered number is positive ");
            
         }
         else if(num==0)
         {
            System.out.println("Entered number is not positive or negative ");
         }
         else
         {
            System.out.println("Entered number is Negative ");
         }
    }
    
}
