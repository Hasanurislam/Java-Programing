class Shape {
    // Default method to display generic shape information
    public void area() {
        System.out.println("This is a shape");
    }
}

class Tringle extends Shape {
    // Overloaded area method for a triangle
    public void area(int l, int h) {
        System.out.println("Area of Triangle: " + (0.5 * l * h));
    }

    // Constructor for Triangle
    public Tringle() {
        System.out.println("Triangle created");
    }

    // Overriding the default area method
    @Override
    public void area() {
        System.out.println("This is a Triangle");
    }
}

class Circle extends Shape {
    // Overloaded area method for a circle
    public void area(int r) {
        System.out.println("Area of Circle: " + (3.14 * r * r));
    }

    // Constructor for Circle
    public Circle() {
        System.out.println("Circle created");
    }

    // Overriding the default area method
    @Override
    public void area() {
        System.out.println("This is a Circle");
    }
}

class Square extends Shape {
    // Overloaded area method for a square
    public void area(int side) {
        System.out.println("Area of Square: " + (side * side));
    }

    // Constructor for Square
    public Square() {
        System.out.println("Square created");
    }

    // Overriding the default area method
    @Override
    public void area() {
        System.out.println("This is a Square");
    }
}

class Rectangle extends Shape {
    // Overloaded area method for a rectangle
    public void area(int length, int width) {
        System.out.println("Area of Rectangle: " + (length * width));
    }

    // Constructor for Rectangle
    public Rectangle() {
        System.out.println("Rectangle created");
    }

    // Overriding the default area method
    @Override
    public void area() {
        System.out.println("This is a Rectangle");
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        // Creating objects for different shapes
        Tringle t1 = new Tringle();
        Circle c1 = new Circle();
        Square s1 = new Square();
        Rectangle r1 = new Rectangle();

        // Polymorphism - All references are of type Shape
        Shape shape1 = t1;
        Shape shape2 = c1;
        Shape shape3 = s1;
        Shape shape4 = r1;

        // Calling area methods with parameters for specific calculations
        t1.area(5, 7);  // Triangle
        c1.area(5);     // Circle
        s1.area(5);     // Square
        r1.area(4, 6);  // Rectangle

        // Demonstrating polymorphism by calling overridden methods
        shape1.area();  // Displays info about Triangle
        shape2.area();  // Displays info about Circle
        shape3.area();  // Displays info about Square
        shape4.area();  // Displays info about Rectangle
    }
}
