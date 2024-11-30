import java.util.Scanner;

class A{
       int num1;
       int num2;
    A(int a,int b){
       this.num1=a;
       this.num2=b;
       System.out.println("Before swaping :A= " +num1 +" B "+num2);
    }
    A(A ref){
        int temp;
        temp=ref.num1;
        this.num1=ref.num2;
        this.num2=temp;
        System.out.println("After swaping : A= "+this.num1 +" B= "+this.num2);
    }
}
public class Lab8 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter the value of A : ");
        int n1=ob.nextInt();
        System.out.print("Enter the value of B : ");
        int n2=ob.nextInt();
        A ob1=new A(n1,n2);
        A ob2=new A(ob1);

    }
}
