class A{
    //int a=10;
    void show(){
        System.out.println("Hello1");
    }
}
class B extends A{
    //int a=30;
    void show(){
        super.show();
        System.out.println("Hello2");
    }

}
public class SuperKeybord {
    public static void main(String args[]){
        B r=new B();
        r.show();
    }
    
}
