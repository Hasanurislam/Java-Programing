import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        int num1,num2;
        System.out.print("Enter the first number: ");
        Scanner ref=new Scanner(System.in);
        num1=ref.nextInt();
        System.out.print("Enter the first number: ");
        num2=ref.nextInt();

        System.out.println("Before swap a="+num1 +  "  b="+num2);

        int temp;

        temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("After swap a="+num1 +  "  b="+num2);

    }
    
}
