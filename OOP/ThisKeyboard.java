class A{
    int a;
    A(int a){
        a=a;
    }
    void show(){
        System.out.println(a);
    }
}
public class ThisKeyboard {
    public static void main(String args[]){
        A r=new A(100);
        r.show();

    }
    
}