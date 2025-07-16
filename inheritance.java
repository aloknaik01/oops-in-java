//Inheritance in Java
//What is Inheritance?

/* 
Inheritance in Java is a mechanism where one class acquires the properties and behaviors (fields and methods) of another class.
 */
//It helps achieve:
/*
Code reusability → write code once, reuse it in multiple classes.
Hierarchical classification → models real-world relationships.
Easy maintenance → changes in the parent class reflect in child classes.
 */
// Terms Used in Inheritance
/*
Super Class (Parent/Base Class)
The class whose properties are inherited.
Sub Class (Child/Derived Class)
The class that inherits properties of another class.
 */

 /*
class Animal {

    void eat() {
        System.out.println("Animal eat");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog bark");
    }
}

class Inheritance {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
        d1.bark();
    }
}

 */

 /*
Here:
Animal → Super Class
Dog → Sub Class
 */
//Syntax of Inheritance
/*
 class SubClass extends SuperClass {
    // additional fields and methods
}
 */
//extends keyword → used to inherit a class.
//Types of Inheritance in Java
//Java supports several forms of inheritance:
//1. Single Inheritance
//One subclass inherits from one superclass.

/*
class Vehicle {

    void run() {
        System.out.println("Vehicle is Running");
    }
}

class Bike extends Vehicle {

    void display() {
        System.out.println("Bike has Two Wheels");
    }
}

class Test {

    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.display();
        b1.run();
    }
}

 */
//2. Multilevel Inheritance
class Animal {

    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Barking...");
    }
}

class BabyDog extends Dog {

    void weep() {
        System.out.println("Wapping...");
    }
}

class Test {

    public static void main(String[] args) {
        BabyDog bd1 = new BabyDog();
        bd1.eat();
        bd1.bark();
        bd1.weep();
    }
}


/* output :-
Eating...
Barking...
Weeping...
 */
