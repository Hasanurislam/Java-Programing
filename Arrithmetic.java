import java.util.Scanner;

public class Arrithmetic {
    public static void main(String[] args) {
        int a,b;
        System.out.print("Enter two number:");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        System.out.println("ADDITION " +(a+b));
        System.out.println("SUBSTRACTION " +(a-b));
        System.out.println("Multiplication " +(a*b));
        System.out.println("Division " +(a/b));
        System.out.println("REminder " +(a%b));
    }
    
}
//write a constractor in java to input a terrm and print the faccnicai series of the term