class pen{
    String color;
    String type;
    public void write(){
        System.out.println("write something");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
}
class Student{
      String name;
      int age;

      public void printdetails(){
        System.out.println(this.name);
        System.out.println(this.age);
      }
}
public class OOP {
    public static void main(String[] args) {
     Student student1=new Student();
      student1.name="Hasanur";
      student1.age=24;

      student1.printdetails();
      
    }
    
    
}
