class Student{
    String name;
    int age;
    public void prrintInfo(String name){
        System.out.println(name);
    }
    public void prrintInfo(int age){
        System.out.print(age);
    }
    public void prrintInfo(String name,int age){
        System.out.println(name+" "+age);
    }

}
public class Polymorphism {
    public static void main(String[] args) {
    
    Student s1=new Student();
    s1.name="Hasanur";
    s1.age=24;
    s1.prrintInfo(s1.name,s1.age);

    }
}
