import java.util.Scanner;

public class coditionalStatement {
    public static void main(String[] args) {
        int n;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=r.nextInt();
        n=r.nextInt();
        if(n>=0)
        {
            System.out.println("the number is +ve " +n);
        }else
        {
            System.out.println("The number is -ve "+n);
        }

    }
}
