import java.util.Scanner;

class Input{
    int num;
    Input()
    {
       Scanner ob=new Scanner(System.in);
       System.out.print("Enter the term: ");
       num=ob.nextInt();

    }
}
class Generate extends Input
{    
    Generate()
    {
    if(num<1)
    {
        System.out.print("Enter a valid number: ");
         num=1;
    }
}
}
class Fibonacci extends Generate
{
    Fibonacci()
    {   
        int a=0;
        int b=1;
        int c=0;
        System.out.print("Fibonacci series: ");
        for(int i=1;i<num;i++)
        {   

            c=a+b;
            System.out.print(a+" ");
            a=b;
            b=c;


        }
    }
}


public class Lab16 {
    public static void main(String[] args) {
        Fibonacci ref=new Fibonacci();
    }
    
}
