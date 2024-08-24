import java.util.Scanner;

public class Q8 {
    public static void main(String[] args)
    {
        int a,b,c;
        System.out.print("Enter the first number: ");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        System.out.print("Enter the second number: ");
        b=r.nextInt();
        System.out.print("Enter the third number: ");
        c=r.nextInt();
        if(a>b)
        {
            if (a>c) {
                System.out.println("Maximum: "+a);
            }
            else
            {
                System.out.println("Maximum: "+c);
            }

        }
        else
        {
          if (b>c) {
            System.out.println("Maximum: "+b);
          }
          else
          {
            System.out.println("Maximum: "+c);
          }
        }


    }
    
}
