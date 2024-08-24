//count number of a digits

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        int n,count=0;
        System.out.print("Enter a number: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        while (n>0) {
            n=n/10;
            count++;
            
        }
        System.out.print("number of digits: "+count);
    }
    
}
