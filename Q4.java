import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the range: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(int i=0;i<=n;i++)
        {
            if (i%2==0) {
                System.out.print(i +" ");
                
            }
        }
    }
}
