import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        String a,b;
        Scanner ref=new Scanner(System.in);
        System.out.print("Enter your Name: ");
        a=ref.nextLine();
        System.out.print("Enter your title:" );
        b=ref.nextLine();
        String c=a+" "+b;
        System.out.print("Full Name:"+c);

    }
    
}
