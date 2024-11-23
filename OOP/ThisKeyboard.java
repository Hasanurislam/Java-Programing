class A {
    int a;

    // Constructor to initialize 'a'
    A(int a) {
        this.a = a;
    }

    // Method to display the value and some additional logic
    void show() {
        System.out.println("Value of a: " + a);
        System.out.println("Square of a: " + (a * a));
        System.out.println("Is a even? " + (a % 2 == 0 ? "Yes" : "No"));
    }
}

public class ThisKeyboard {
    public static void main(String args[]) {
        // Creating an object of class A and initializing with 100
        A r = new A(100);

        // Calling the show method to display the value and additional info
        r.show();
    }
}
