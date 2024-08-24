import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        int a,b;
        System.out.print("Enter first number: ");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        System.out.print("Enter second number: ");
        b=r.nextInt();

        if (a>b) {
            System.out.println("Maximum Number is " +a);
            
        }else
        {
            System.out.println("Maximum Number is " +b);
            
        }
    }
    
}
