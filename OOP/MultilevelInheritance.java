class A{
    int a,b,c;
    void add(){
        a=10;
        b=20;
        c=a+b;
        System.out.println("add of two Number:"+c);
    }

}
class B extends A{
    void sub(){
        a=10;b=20;
        c=a-b;
        System.out.println("sub of two Number:"+c);
    }

}
class C extends B{
    void mul(){
            a=10;b=20;
            c=a*b;
            System.out.println("multiplication of two Number:"+c);
    }
}
class D extends C{
    void rem(){
        a=10;b=20;
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
