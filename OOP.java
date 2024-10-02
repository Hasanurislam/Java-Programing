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
public class OOP {
    public static void main(String[] args) {
        pen pen1=new pen();
        pen1.color="red";
        pen1.type="gel";
        pen pen2=new pen();
        pen2.color="green";
        pen2.type="bolpen";

        pen1.printcolor();
        pen2.printcolor();
        pen1.write();
        

    }
    
    
}
