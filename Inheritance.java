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
        System.out.println((3.14)*r*r);
    }
}
class square extends shape{
    public void area(int side){
        System.out.println("area of square "+(side*side));
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Tringle t1=new Tringle();
        circle c1=new circle();
        square s1=new square();
        t1.area(5,7);
        c1.area(5);
        s1.area(5);

    }
}
