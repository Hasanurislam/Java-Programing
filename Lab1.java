import java.util.Scanner;
public class Lab1 {
    public static void main(String args[]){
        int r;
        System.out.println("Enter the Number:");
        Scanner ref=new Scanner(System.in);
        int num=ref.nextInt();
        while (num>0) {
            r=num%10;
            System.out.print(r);
            num=num/10;
        }
    }
    
}
