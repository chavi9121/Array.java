4)Swap of integers,double using method overloading?

java
// Abstract class
abstract class Animal {
    public abstract void sound();
    public void sleep() {
        System.out.println("Zzzz...");
    }
}

// Interface
interface Swimmer {
    void swim();
}

// Concrete class implementing the abstract class and interface
class Dolphin extends Animal implements Swimmer {
    public void sound() {
        System.out.println("Dolphin makes a clicking sound");
    }
    public void swim() {
        System.out.println("Dolphin swims gracefully");
    }
}

public class Main {
    public static void main(String[] args) {
        Dolphin dolphin = new Dolphin();
        dolphin.sound();
        dolphin.swim();
        dolphin.sleep();
    }
}

5)Abstract class using Hirerchial inhertiance?

java
final class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public final double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        double area = circle.calculateArea();
        System.out.println("Area of the circle: " + area);
    }
}

