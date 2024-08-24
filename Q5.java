import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int n,sum=0;
        System.out.println("Enter the range: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        if(n%2==0)
        {
           for(int i=0;i<=n;i++)
           {
            if(i%2==0)
            {
            sum=sum+i;
            }
           }
           System.out.println("The sum of even number "+sum);
        }
        else
        {
          for(int i=0;i<=n;i++)
          {
            if(i%2==1)
            {
            sum=sum+i;
            }
          }
          System.out.println("The sum of odd number "+sum);
        }
       
    }
}
