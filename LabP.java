import java.util.Scanner;

class Swap{
    int n1,n2;
    Swap(int c,int d)
    {
      this.n1=c;
      this.n2=d;
      System.out.println("Before Swaping the value of A= "+this.n1+" B= "+this.n2);

    }
    Swap(Swap ref)
    {
        int temp;
        temp=ref.n1;
        ref.n1=ref.n2;
        ref.n2=temp;
        System.out.println("After swaping the value of A= "+ref.n1+" B= "+ref.n2);
    }
}
public class LabP {
   
    public static void main(String[] args) {
        int a,b;
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        a=ob.nextInt();
        System.out.println("Enter the value of B: ");
        b=ob.nextInt();

        Swap r1=new Swap(a,b);
        Swap r2=new Swap(r1);
        
      
    }
}
