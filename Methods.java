import java.util.Scanner;
public class Methods {
    int n1,n2;
    int add,mul;
    float div;
    public static void main(String[] args)
    {  
        Methods r=new Methods();
        r.input();
        r.process();
        r.output();
    }
    void input()
    {   Scanner r=new Scanner(System.in);
         System.out.print("Enter two number: ");
         n1=r.nextInt();
         n2=r.nextInt();
    }
    void process()
    {
       add=n1+n2;
       mul=n1*n2;
       div=n1/n2;
    }
    void output()
    {
      System.out.println(add);
      System.out.println(mul);
      System.out.println(div);
    }
}
