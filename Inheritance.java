class shape{
    public void area(){
        System.out.print("displays");
    }

}
class Tringle extends shape{
      public void area(int l,int h){
        System.out.println(1/2*l*h);
      }
}
public class Inheritance {
    public static void main(String[] args) {
        Tringle t1=new Tringle();
        
    }
}
