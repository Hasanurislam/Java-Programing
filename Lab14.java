import java.util.Scanner;

public class Lab14 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter the term: ");
        int n=ob.nextInt();
        int sum=0;
        if(n<=0)
        {
            System.out.print("Enter a positive number or grather the 0 ");
        }
        else{
            for(int i=1;i<=n;i++)
            {
                sum=sum+i;
            }
            System.out.print("The sum of "+n+" natural number "+sum);

        }
    }
    
}
