import java.util.Scanner;
public class Q54 {
    public static void main(String[] args) {
        int a=0,b=1,c=2,d;
        int sum=0,term;
        System.out.print("Enter the number of term: ");
        Scanner ob=new Scanner(System.in);
        term=ob.nextInt();
        System.out.print("Fibonacci seies are: ");
        
        for(int i=1;i<=term;i++)
        {   System.out.print(a+" ");
            d=a+b+c;
            
            a=b;
            b=c;
            c=d;
            
        }
    }
    
}
