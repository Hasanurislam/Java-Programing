class A{
    int a=10;
}
class B extends A{
    int a=30;
    void show(){
        System.out.println(super.a);
    }

}
public class SuperKeybord {
    public static void main(String args[]){
        B r=new B();
        r.show();
    }
    
}