import java.util.Scanner;


public class LabP {
    public void reverse(int num)
    {   
        if(num<=0)
        {
            System.out.print("Please enter a positive number");
        }else{
        System.out.print("Reverse of a number:");
        while(num>0)
        {
            int rem=num%10;
            System.out.print(rem);
            num=num/10;
        }
    }
    }
    public static void main(String[] args) {
        int n;
        System.out.print("Enter a Number: ");
        Scanner ob=new Scanner(System.in);
        n=ob.nextInt();
        LabP r=new LabP();
        r.reverse(n);
    }
}
