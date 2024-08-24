import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        int age;
        System.out.print("Enter your age: ");
        Scanner r=new Scanner(System.in);
        age=r.nextInt();
        if(age>=18)
        {
            System.out.print("Your eligible for vote ");

        }
        else
        {
            System.out.print("Your Not eligible for vote Your a minor");
        }

    }
    
}
