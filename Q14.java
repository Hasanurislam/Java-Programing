//Tax calculation
//input salary=>10000--------->No Tax
//input salary>10000 between salary<100000------>10% Tax
//input salary>100000------>10% Tax
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        int sal;
        System.out.print("Enter your salary: ");
        Scanner r=new Scanner(System.in);
        sal=r.nextInt();
        double tax;
        if(sal<=10000)
        {
          System.out.println("No tax");
        }
        else if(sal>10000 && sal<100000)
        {
          tax=sal*0.10;
          System.out.print("After tax your salary: "+tax);
        }
        else
        {
          tax=sal*0.20;
          System.out.print("After tax your salary: "+tax);
        }
    }
    
}
