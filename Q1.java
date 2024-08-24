import java.util.Scanner;

public class Q1 {
    public static void main(String[] args)
    {
        int n;
        System.out.println("enter a number: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        if (n%2==0) {
            System.out.println("the number is even");
            
        }else{
            System.out.println("the number is odd");
        }
    }
    
}
