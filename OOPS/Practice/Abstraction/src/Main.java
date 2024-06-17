abstract class Animal {
    // Abstract method (does not have a body)
    abstract void sound();

    // Regular method
    void sleep() {
        System.out.println("This animal is sleeping");
    }
}

class Dog extends Animal {
    // Providing implementation for the abstract method
    void sound() {
        System.out.println("The dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();  // Output: The dog barks
        dog.sleep();  // Output: This animal is sleeping
    }
}
