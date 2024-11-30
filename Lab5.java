import java.util.Scanner;
class Fibonacci{

    Fibonacci(int term){
        int a=0,b=1,c;
        System.out.print("Fibonaci series are: ");
        for(int i=1;i<=term;i++){
        c=a+b;
        System.out.print(a+" ");
        a=b;
        b=c;
        }
    }
}
public class Lab5 {
    public static void main(String[] args) {
        System.out.print("Enter the Number of term: ");
        Scanner ref=new Scanner(System.in);
        int term1=ref.nextInt();
        Fibonacci r=new Fibonacci(term1);
        ref.close();
    }
    
}
