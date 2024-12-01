import java.util.Scanner;

class Binary{
    int num;
    Binary()
    {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int n=ob.nextInt();
        this.num=n;
        String binary=" ";
        while(n>0)
        {
            int rem=n%2;
            binary=rem +binary;
            n=n/2;
        }
        n=this.num;
        System.out.print("The binary of "+n+"="+binary);
    }
}
public class LabP {
   
    public static void main(String[] args) {
       Binary r=new Binary();
      
    }
}
