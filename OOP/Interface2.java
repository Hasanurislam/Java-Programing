interface A{
    void show();
}
interface B
{
    void show();
}
class C implements A,B
{
    public void show(){
       System.out.println("Hello");
    }
}
public class Interface2 {
    public static void main(String[] args) {
        C r=new C();
        r.show();
    }
    
}
