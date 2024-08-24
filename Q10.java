//Find factorial of a number
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args)
    {
       int num;
       System.out.print("Enter a number: ");
       Scanner r=new Scanner(System.in);
       num=r.nextInt();
       int factorial=1;
       for(int i=num;i>0;i--)
       {
          factorial=factorial*i;
       }
       System.out.println("Factorial: "+factorial);

    }
    
}
