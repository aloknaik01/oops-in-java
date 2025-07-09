//What is a Method?
//A method in Java is a block of code that performs a specific task.

//Syntax of a Method

/*

returnType methodName(parameterList) {
    // method body
    // code to execute
}

 */
//Types of Methods in Java
//1. Standard Method Types
/* 
No-argument method

Parameterized method

Return-type method

Void method
 */
//2. Based on Declaration

/*
 
  Static method
  Non-static (Instance) method

 */
//3. Based on Argument Type

/*
  Primitive type argument method
  Non-primitive type argument method
 */
//1. No-Argument Method
//Takes no input parameters.
//Usually used for tasks that don't need external values.
class Greet {

    void sayHello() {
        System.out.println("Hello, Alok!");
    }

    public static void main(String[] args) {
        Greet g = new Greet();
        g.sayHello();
    }
}

//Output - Hello, Alok!
// 2. Parameterized Method

/*
  Accepts values as input (parameters).
Makes method more flexible and reusable.
 */
class MathOperations {

    void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void main(String[] args) {
        MathOperations m = new MathOperations();
        m.add(5, 10);
    }
}

//Output - Sum: 15
// 3. Return-Type Method
//Returns a value to the caller using the return keyword.
class Calculator {

    int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        int result = c.square(5);
        System.out.println("Square " + result);
    }
}

//Output - Square 25
//4. Void Method
//Performs a task but does not return a value.
class VoidMethod {

    void display() {
        System.out.println("This is a void method.");
    }

    public static void main(String[] args) {
        VoidMethod v1 = new VoidMethod();
        v1.display();
    }
}

//Output - This is a void method.
// 5. Static Method
//Declared with the static keyword.
//Can be called without creating an object.
// it can be call by 3 ways
//1.Directly
//2.Class Name
//3.Object Reference
class StaticMethod {

    static void staticMethod() {
        System.out.println("Static Method");
    }

    public static void main(String[] args) {
        //directly 
        staticMethod();
        //class Name
        StaticMethod.staticMethod();
        //Onject Reference
        StaticMethod sm1 = new StaticMethod();
        sm1.staticMethod();
    }
}

//Output  :-
//Static Method
//Static Method
//Static 
//6. Non-static (Instance) Method
//Belongs to an object.
//Can access both static and non-static members.
//Requires object creation to be called.
class NsMethod {

    void show() {
        System.out.println("Instance method");
    }

    public static void main(String[] args) {
        NsMethod m1 = new NsMethod();
        m1.show();
    }
}

// 7. Method with Primitive Arguments
class MethodPrimitiveArgs {

    static void add(int a, int b) {
        System.out.println("Sum is " + (a + b));
    }

    public static void main(String[] args) {
        add(5, 10);
    }
}

// Output - Sum is 15
// 8. Method with Non-Primitive Argument
//You can pass objects, arrays, or classes as arguments.
class Student {

    String name;

    Student(String n) {
        name = n;
    }
}

class Show {

    void printName(Student s) {
        System.out.println("Name " + s.name);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alok");
        Show s = new Show();
        s.printName(s1);
    }
}

// 9. Method Overloading
//Multiple methods with the same name but different parameters.
//Known as compile-time polymorphism.
class Moverload {

    static void show() {
        System.out.println("No Parameter");
    }

    void show(int a) {
        System.out.println("One Parameter: " + a);
    }

    void show(int a, String b) {
        System.out.println("Two parameters : " + a + ", " + b);
    }

    public static void main(String[] args) {
        show();
        show(10);
        show(21, "Alok");
    }
}

//Output - 
//No Parameter
//One Parameter
//Two Parameter
//Real-life Example
//Imagine a WashingMachine class:
//Method: start(), stop(), setTimer(int time)
//Every washing machine object can use these actions differently

