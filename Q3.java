import java.util.Scanner;

public class Q3 {
    public static void main(String[] args)
    {
        int n,sum=0;
        System.out.println("Enter the number of term: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(int i=1;i<=n;i++)
        {
          sum=sum+i;
          
        }
        System.out.println(sum);
    }
}
