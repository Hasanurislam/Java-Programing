import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        int ch;
        System.out.println("Enter the weekend code: ");
        Scanner ref=new Scanner(System.in);
        ch=ref.nextInt();
        switch (ch) {
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("Wednesday");
            break;
            case 5:
            System.out.println("thursday");
            break;
            case 6:
            System.out.println("Saturady");
            break;
            default:
            System.out.println("Invalid");
                break;
        }
    }
    
}
