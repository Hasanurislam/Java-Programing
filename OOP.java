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
      Student(Student s2 ){
        this.name=s2.name;
        this.age=s2.age;
      }
      Student(){

      }
}
public class OOP {
    public static void main(String[] args) {
     Student student1=new Student();
      student1.name="Hasanur";
      student1.age=24;

      Student s2=new Student(student1);
      s2.printdetails();

     
      
    }
    
    
}
