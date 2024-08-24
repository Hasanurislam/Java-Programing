import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of term: ");
        Scanner obj=new Scanner(System.in);
        n= obj.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print(i +" ");
        }
    }
}
