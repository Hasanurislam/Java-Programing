import java.util.Scanner;
public class Q29 {
    public static void main(String[] args) {
        int num,sum=0;
        System.out.print("Enter any number: ");
        Scanner ref=new Scanner(System.in);
        num=ref.nextInt();
        int num2=num;
        for(int i=1;i<num;i++)
        {
          if(num%i==0)
          {
            sum=sum+i;
          }
        }
        if(num2==sum)
        {
            System.out.print("Parfect NUmber");
        }
        else
        {
            System.out.print("Not Parfect NUmber");
        }
    }
    
}
