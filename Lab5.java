import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        int a=0 ,c,b=1,term;
        System.out.print("Enter the Number of term:");
        Scanner ref=new Scanner(System.in);
        term=ref.nextInt();
        for(int i=1;i<=term;i++){
        System.out.print(a+" ");
         c=a+b;
         a=b;
         b=c;
        
        }

    }
    
}
