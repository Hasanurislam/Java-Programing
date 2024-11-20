

class Student{
    int RollNo;
    String Name;
    String Course;
    void inp(){
        System.out.println("Enter your Name ,RollNo,Course");
    }
}
class Hasanur extends Student{
    void dis(){
        RollNo=10;
        Name="Hasanur Islam";
        Course="BCA";
        System.out.println(Name+" "+RollNo+" "+Course);
    }
}
public class Inheritance {
    public static void main(String args[]){
        Hasanur obj=new Hasanur();
        obj.inp();
        obj.dis();
    }

    
}