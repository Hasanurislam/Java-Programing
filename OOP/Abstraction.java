abstract class Animal
{    
    Animal()
    {
        System.out.println("All animals...");
    }
     public abstract void sound();

}
class dog extends Animal
{    
    dog()
    {
        super();
    }
    public void sound()
    {
        System.out.println("Dog is barking....");
    }
}
class Lion extends Animal{
    Lion()
    {
        super();
    }
    public void sound()
    {
        System.out.println("Lion is Roer.....");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        dog d=new dog();
        Lion l=new Lion();
        d.sound();l.sound();

        
    }
}
