abstract class Animal{
abstract void walk();
}
class Hourse extends Animal{
    public void walk(){
        System.out.print("walk on four leg");
    }
}
class chicken extends Animal{
    public void walk(){
        System.out.println("walk on two leg");
    }
}


public class Abstraction {
    public static void main(String[] args) {
        Hourse h1=new Hourse();
        h1.walk();
    }
    
}
