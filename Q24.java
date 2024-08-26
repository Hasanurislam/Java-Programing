//revarse of a number
import java.util.Scanner;
public class Q24 {
    public static void main(String[] args) {
        int num,r,n;
        System.out.print("Enter a number: ");
        Scanner ref=new Scanner(System.in);
        num=ref.nextInt();
        while (num>0) {
        r=num%10;
        System.out.print(r);
        num=num/10;
        }


    }
    
}
