import java.util.Scanner;

public class LabP {
   
    public static void main(String[] args) {
       Scanner ob=new Scanner(System.in);
       System.out.print("Enter a Number: ");
       int n=ob.nextInt();
       int orginal=n;
       int digit,fact=1,sum=0;
       while(n>0)
       {
        digit=n%10;
        fact=1;
        for(int i=1;i<=digit;i++)
        {
          fact=fact*i;
        }
         sum=sum+fact;
         n=n/10;
       }
       n=orginal;
       if(sum==n)
       {
        System.out.print("it is a krishnamurty number: ");
       }
       else{
        System.out.print("Not a krishnamurty number: ");
       }
      
    }
}
