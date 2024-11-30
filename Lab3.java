import java.util.Scanner;

public class Lab3 {
     static void print(int n){
        int r;
        while(n>0){
        r=n%10;
        System.out.print(r);
        n=n/10;
        }

    }
    public static void main(String[] args) {
        int n1;
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter the term:");
        n1=ob.nextInt();
        print(n1);
    }
}
