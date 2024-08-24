//calculate average of 5 sub marks

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        int english,math,physics,chemistry,biology;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter English marks: ");
        english=r.nextInt();
        System.out.print("Enter Math marks: ");
        math=r.nextInt();
        System.out.print("Enter physics marks: ");
        physics=r.nextInt();
        System.out.print("Enter chemistry marks: ");
        chemistry=r.nextInt();
        System.out.print("Enter Biology marks: ");
        biology=r.nextInt();

        double avg;
        int sum=english+math+physics+chemistry+biology;
        avg=sum/5.0;
        System.out.println("The average marks: "+avg);
    }
    
}
