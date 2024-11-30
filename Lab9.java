import java.util.Scanner;

public class Lab9 {
    public static void main(String[] args) {
        Scanner ref=new Scanner(System.in);
        int binary[]=new int[100];
        int num;
        int i=0;
        System.out.print("Enter the Decimal value: ");
        num=ref.nextInt();

        while(num>0){
            binary[i]=num%2;
            num=num/2;
            i++;

        }
        System.out.print("Binary Eaquivalent: ");
        for(int j=i-1;j>=0;j--){
          System.out.print(""+binary[j]);
        }

    }
}
