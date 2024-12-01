import java.util.Scanner;

class Fibonacci{
    Fibonacci(int num)
    {
        int a=0;
        int b=1;
        int c;
        System.out.print("Fibonacci series are: ");
        for(int i=0;i<num;i++)
        {
            c=a+b;
            System.out.print(a+" ");
            a=b;
            b=c;
        }


    }
}
public class LabP {
   
    public static void main(String[] args) {
        int n;
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter the term: ");
        n=ob.nextInt();
        Fibonacci r=new Fibonacci(n);

      
    }
}
