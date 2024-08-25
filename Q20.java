import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter a number: ");
        Scanner ref=new Scanner(System.in);
        num=ref.nextInt();

        if (num%5==0) {
            System.out.println("Entered number is divisile by 5 ");
            
        }
        else
        {
            System.out.println("Entered number is not divisile by 5 ");
        }
    }
    
}
