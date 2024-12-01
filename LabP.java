import java.util.Scanner;

public class LabP {
    public static void main(String[] args) {
        int num;
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        num=ob.nextInt();
        System.out.print("Reverse of the number:");
        while(num>0)
        {
            int rem=num%10;
            System.out.print(rem);
            num=num/10;
        }
    }
    
}
