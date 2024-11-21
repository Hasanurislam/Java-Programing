import java.util.*;
class A{
    int a,b,c;
    void add(){
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the first Number:");
        a=r.nextInt();
        System.out.println("Enter the second Number:");
        b=r.nextInt();
        c=a+b;
        System.out.println("add of two Number:"+c);
    }

}
class B extends A{
    void sub(){
        c=a-b;
        System.out.println("sub of two Number:"+c);
    }

}
class C extends B{
    void mul(){
            c=a*b;
            System.out.println("multiplication of two Number:"+c);
    }
}
class D extends C{
    void rem(){
        c=a%b;
        System.out.println("remiender of two Number:"+c);
    }
}


public class MultilevelInheritance {
    public static void main(String args[]){
        D ref=new D();
        ref.add();
        ref.sub();
        ref.mul();
        ref.rem();
    }
}
