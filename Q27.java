import java.util.Scanner;
public class Q27 {
    public static void main(String[] args) {
        int num,r,arm=0;
        System.out.print("Enter any number: ");
        Scanner ref=new Scanner(System.in);
        num=ref.nextInt();
        int c=num;
        while(num>0)
        {
            r=num%10;
            arm=arm+(r*r*r);
            num=num/10;

        }
        if(c==arm)
        {
            System.out.print("Armstrone Number ");
        }
        else
        {
            System.out.print("Not Armstrone Number ");
        }
        }
    }
    

