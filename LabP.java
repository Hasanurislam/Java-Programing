import java.util.Scanner;


public class LabP {
   
    public static void main(String[] args) {
        int a,b;
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        a=ob.nextInt();
        System.out.print("Enter the value of B: ");
        b=ob.nextInt();
        System.out.println("Before swaping value of A= "+a+" B= "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swaping value of A= "+a+" B= "+b);
        

      
    }
}
