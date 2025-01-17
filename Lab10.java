import java.util.Scanner;

class Calculate{
    Calculate(int num){
        for(int i=1;i<=10;i++)
        {
            int m;
            m=num*i;
            System.out.println(num+"X"+i+"="+m);
        }

    }
}
public class Lab10 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter the term:");
        int n=ob.nextInt();
        Calculate r=new Calculate(n);

    }
    
}
