import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        int n;
        Scanner ref=new Scanner(System.in);
        System.out.print("Enter a Number:");
        n=ref.nextInt();
        int i=1,fact=1;
        while(i<=n){
        fact=fact*i;
        i++;
        }
        System.out.print("Factorial of the input term:"+fact);

    }
    
}
