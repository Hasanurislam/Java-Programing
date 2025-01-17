import java.util.Scanner;

public class Lab20 {
    static void chechnum(int num)
    {
        int digit=0;
        int result=0;
        int orginalnum=num;
        int rem;

       while(num>0)
       {
        num=num/10;
        digit++;
       }
       num=orginalnum;
       while(num>0)
       {
        rem=num%10;
        result+=Math.pow(rem,digit);
        num=num/10;
        
       }
       if(orginalnum==result)
       {
        System.out.print("ia a Armstrong Number: ");
       }
       else{
        System.out.print("is Not a Armstrong Number");
       }

    }

    public static void main(String[] args) {
        System.out.print("Enter Any Number: ");
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        Lab20 r=new Lab20();
        r.chechnum(n);
        
    }
    
}
