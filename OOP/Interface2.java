interface A{
    void show();
}
interface B
{
    void show();
}
interface D{
    void show();
}
class C implements A,B,D
{
    public void show(){
       System.out.println("Hi");
    }
}
public class Interface2 {
    public static void main(String[] args) {
        C r=new C();
        r.show();
    }
    
}
