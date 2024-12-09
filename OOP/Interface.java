import java.util.Scanner;

interface Client {
    void input();
    void output();
}

class Hasanur implements Client{
    String name;
    double salary; 
      public void input()
      { 
        Scanner r=new Scanner(System.in);
        System.out.println("Enter your Name:");
        name= r.nextLine();
        System.out.println("Enter your salary:");
        salary=r.nextDouble();
      }
      public void output()
      {
        System.out.println(name+" "+salary);
      }
}
public class Interface {
       public static void main(String[] args) {
        Client ob=new Hasanur();
        ob.input();
        ob.output();
       }
    
}