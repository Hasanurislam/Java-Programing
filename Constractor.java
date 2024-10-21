/*class A{
    int a; String name;
    /*A(){
        a=0;name=null;
    }
        
    void show(){
        System.out.print(a+"  "+name);
    }

}
public class Constractor {
    public static void main(String args[]){
        A ref=new A();
        ref.show();
    }
}
    */
    // Class definition
class Car {
    // Instance variables
    String model;
    String color;
    int year;

    // Constructor with parameters
    Car(String model, String color, int year) {
        this.model = model;   // 'this' keyword is used to refer to the current object's variables
        this.color = color;
        this.year = year;
    }

    // Method to display car details
    void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class and calling the constructor
        Car car1 = new Car("Toyota Corolla", "Red", 2020);

        // Displaying the car details
        car1.displayDetails();
    }
}

