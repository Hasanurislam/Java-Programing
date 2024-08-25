import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter a number: ");
        Scanner ref=new Scanner(System.in);
        num=ref.nextInt();
        for(int i=1;i<=num;i++)
        {
          if (num%i==0) {
            System.out.print(i+" ");
          }
        }
    }
    
}
