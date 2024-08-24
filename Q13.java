import java.util.Scanner;

public class Q13 {
    public static void main(String[] args)
    {
        int num;
        System.out.print("Enter the term: ");
        Scanner r=new Scanner(System.in);
        num=r.nextInt();
        int mul;
        for(int i=1;i<=10;i++)
        {
            mul=num*i;
            System.out.println(num +"x" +i +"=" +mul);
        }
    }
    
}
