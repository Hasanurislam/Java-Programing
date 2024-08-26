import java.util.Scanner;
public class Q25 {
    public static void main(String[] args) {
        int num,r,sum=0;
        System.out.print("Enter a digits: ");
        Scanner ref=new Scanner(System.in);
        num=ref.nextInt();

        while (num>0) {
            r=num%10;
            sum=sum+r;
            num=num/10;
            
        }
        System.out.print(sum);
    }
    
}
