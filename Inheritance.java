class shape{
    public void area(){
        System.out.print("displays");
    }

}
class Tringle extends shape{
      public void area(int l,int h){
        System.out.println(0.5*l*h);
      }
}
class EquallateralTringle extends Tringle{
    public void area(int l,int h){
        System.out.println(0.5*l*h);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Tringle t1=new Tringle();
        t1.area(5,7);
    }
}
