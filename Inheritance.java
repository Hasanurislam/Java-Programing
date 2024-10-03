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
class circle extends shape{
    public void area(int r){
        System.out.print((3.14)*r*r);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Tringle t1=new Tringle();
        circle c1=new circle();
        t1.area(5,7);
        c1.area(5);
    }
}
