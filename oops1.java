Assignment on oops :

1)create Student class with sid,sname,marks datamembers and input() method for input details and output() method to print details?
public class Statement {
    private int sid;
    private String name;
    private double marks;

    public void input(int sid, String name, double marks) {
        this.sid = sid;
        this.name = name;
        this.marks = marks;
    }

    public void output() {
        System.out.println("Student ID: " + sid);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

2)Bankcustomer class with acno,atype,amt fields using constructor overloading?
java
public class BankCustomer {
    private int acno;
    private String atype;
    private double amt;

    public BankCustomer(int acno, String atype) {
        this.acno = acno;
        this.atype = atype;
    }

    public BankCustomer(int acno, String atype, double amt) {
        this.acno = acno;
        this.atype = atype;
        this.amt = amt;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + acno);
        System.out.println("Account Type: " + atype);
        System.out.println("Account Balance: $" + amt);
    }
}

3)Make a program  with static member,static method?
java
public class StaticExample {
    private static int count = 0;

    public static void incrementCount() {
        count++;
    }

    public static void main(String[] args) {
        incrementCount();
        incrementCount();
        incrementCount();

        System.out.println("Count: " + count);
    }
4)'this' keyword using data members?

java
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        Person person = new Person("John", 25);
        person.displayDetails();
    }
}
