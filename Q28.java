import java.util.Scanner;
public class Q28 {
    public static void main(String[] args) {
        int num,count=0;
        System.out.print("Enter any number: ");
        Scanner ref=new Scanner(System.in);
        num=ref.nextInt();

        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.print("Prime number");

        }
        else
        {
            System.out.print("Not Prime number");
        }
    }
    
}
