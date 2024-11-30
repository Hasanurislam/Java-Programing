import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        int a=0,b;
        Scanner ref=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        a=ref.nextInt();
        System.out.print("Enter the value of b: ");
        b=ref.nextInt();
        System.out.print("Before swaping the value of A= "+a+ " B= "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print("After swaping the value of A= "+a+"B= "+b);

    }
    
}
