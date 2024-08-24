import java.util.Scanner;

public class RelationalOperator {
    public static void main(String args[])

    {
        int a,b;
        System.out.println("Enter First number: ");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        System.out.println("Enter second number: ");
        b=obj.nextInt();

        System.out.println("true/false  " +(a<b));
        System.out.println("true/false  " +(a>b));
        System.out.println("true/false  " +(a<=b));
        System.out.println("true/false  " +(a>=b));
        System.out.println("true/false  " +(a==b));
        System.out.println("true/false  " +(a!=b));



        

    }
}
