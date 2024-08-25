import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        int mounth;
        System.out.print("Enter the mounth number: ");
        Scanner ref=new Scanner(System.in);
        mounth=ref.nextInt();

        switch (mounth) {
            case 1:
                System.out.println("Januwary=31");
                break;
            case 2:
            System.out.println("Fabwary=28");
            break;
            case 3:
            System.out.println("march=31");
            break;
            case 4:
            System.out.println("april=30");
            break;
            case 5:
            System.out.println("May=31");
            break;
            case 6:
            System.out.println("June=30");
            break;
            case 7:
            System.out.println("July=31");
            break;
            case 8:
            System.out.println("August=31");
            break;
            case 9:
            System.out.println("September=30");
            break;
            case 10:
            System.out.println("October=31");
            break;
            case 11:
            System.out.println("November=30");
            break;
            case 12:
            System.out.println("December=31");
            break;
            default:
            System.out.println("Invalid");
            break;
        }
    }
    
}
