public class StaticBlockExample {

    // Static variable
    static int staticValue;

    // Static block
    static {
        System.out.println("Static block executed.");
        staticValue = 42; // Initializing the static variable
    }

    // Constructor
    public StaticBlockExample() {
        System.out.println("Constructor executed.");
    }

    // Static method to access static variable
    public static void displayStaticValue() {
        System.out.println("Static Value: " + staticValue);
    }

    public static void main(String[] args) {
        System.out.println("Main method starts.");
        
        // Accessing static variable directly
        System.out.println("Accessing static variable: " + staticValue);

        // Creating an object to demonstrate constructor call
        StaticBlockExample example = new StaticBlockExample();

        // Calling a static method
        StaticBlockExample.displayStaticValue();

        System.out.println("Main method ends.");
    }
}
