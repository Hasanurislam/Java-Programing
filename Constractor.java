class A{
    int a; String name;
    /*A(){
        a=0;name=null;
    }
        */
    void show(){
        System.out.print(a+"  "+name);
    }

}
public class Constractor {
    public static void main(String args[]){
        A ref=new A();
        ref.show();
    }
}
