// Base class
class Animal {
    // Method to be overridden
    public void sound() {
        System.out.println("An animal makes a sound.");
    }
}

// Derived class 1
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}

// Derived class 2
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows.");
    }
}

// Another derived class
class Cow extends Animal {
    @Override
    public void sound() {
        System.out.println("Cow moos.");
    }
}

// Main class
public class Polymorphism {
    public static void main(String[] args) {
        // Polymorphism using method overriding
        Animal myAnimal;  // Reference of type Animal
        
        myAnimal = new Dog(); // Dog object
        myAnimal.sound();     // Calls Dog's version of sound()
        
        myAnimal = new Cat(); // Cat object
        myAnimal.sound();     // Calls Cat's version of sound()
        
        myAnimal = new Cow(); // Cow object
        myAnimal.sound();     // Calls Cow's version of sound()
    }
}
