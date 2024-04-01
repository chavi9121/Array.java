1)Prepare multiple inheritance for given below classes?
        Red           Green
            |               |
 
             Yellow
java
class Red {
  // properties and methods of the Red class
}

class Green {
  // properties and methods of the Green class
}

class Yellow extends Red, Green {
  // properties and methods of the Yellow class
}

2)Make sample program with "super()" 

java
class Vehicle {
  String brand;

  public Vehicle(String brand) {
    this.brand = brand;
  }

  public void displayBrand() {
    System.out.println("Brand: " + brand);
  }
}

class Car extends Vehicle {
  int year;

  public Car(String brand, int year) {
    super(brand);
    this.year = year;
  }

  public void displayCarInfo() {
    displayBrand();
    System.out.println("Year: " + year);
  }
}

public class Main {
  public static void main(String[] args) {
    Car myCar = new Car("Toyota", 2022);
    myCar.displayCarInfo();
  }
}

3)To override methods given below classses
       Bank [interst(0%)]
     |
   Sbi [interest(7%)]     Axis[interest(8%)]    Icici[interest[(9%)]

java
class Bank {
  public void interest() {
    System.out.println("Interest rate: 0%");
  }
}

class Sbi extends Bank {
  @Override
  public void interest() {
    System.out.println("Interest rate: 7%");
  }
}

class Axis extends Bank {
  @Override
  public void interest() {
    System.out.println("Interest rate: 8%");
  }
}

class Icici extends Bank {
  @Override
  public void interest() {
    System.out.println("Interest rate: 9%");
  }
}

public class Main {
  public static void main(String[] args) {
    Bank bank = new Bank();
    bank.interest();

    Sbi sbi = new Sbi();
    sbi.interest();

    Axis axis = new Axis();
    axis.interest();

    Icici icici = new Icici();
    icici.interest();
  }
}

4)Swap of integers,double using method overloading?

java
class Swapper {
  public void swap(int a, int b) {
    System.out.println("Before swapping - a: " + a + ", b: " + b);
    int temp = a;
    a = b;
    b = temp;
    System.out.println("After swapping - a: " + a + ", b: " + b);
  }

  public void swap(double a, double b) {
    System.out.println("Before swapping - a: " + a + ", b: " + b);
    double temp = a;
    a = b;
    b = temp;
    System.out.println("After swapping - a: " + a + ", b: " + b);
  }
}

public class Main {
  public static void main(String[] args) {
    Swapper swapper = new Swapper();

    int num1 = 10;
    int num2 = 20;
    swapper.swap(num1, num2);

    double decimal1 = 3.14;
    double decimal2 = 6.28;
    swapper.swap(decimal1, decimal2);
  }
}

5)Abstract class using Hirerchial inhertiance?

java
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing a triangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();

        Shape rectangle = new Rectangle();
        rectangle.draw();

        Shape triangle = new Triangle();
        triangle.draw();
    }
}
