import java.util.Scanner;

public class Q17 {
    public static void main(String[] args)
    {
         int a,b;
         System.out.print("Enter the first number: ");
         Scanner ref=new Scanner(System.in);
         a=ref.nextInt();
         System.out.print("Enter the second number: ");
         b=ref.nextInt();
         System.out.println("Before swaping a="+a +" b="+b);
         a=a+b;
         b=a-b;
         a=a-b;
         System.out.println("After swaping a="+a +" b="+b);
    }
    
}
