import java.util.Scanner;
public class fibonacci 
{
    int a,b;
    fibonacci(int n)
    {
        int c,l;
        a=0;b=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the term");
        n=sc.nextInt();
        System.out.println("Fabnacii series are:");
        System.out.print(a+"  "+b);
        int i=2;
        while (i<n) {
            c=a+b;
            i++;
            System.out.print("  "+c);
            a=b;
            b=c;
        

        }
    }
    public static void main(String[] args) {
        int n1; n1=0;
        fibonacci f1=new fibonacci(n1);
    }
    
}
//write a program in java to swap the values of two without using first variable