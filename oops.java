
// OOPs stands for Object-Oriented Programming System.
//OOPs (Object-Oriented Programming System) is a way of programming in Java where we create objects to model real things.
// These objects have data (like properties) and methods (behaviour). OOPs helps to write code that is organized, reusable, and easy to maintain.
//Major Principles of OOPs
//1. Class
//A class is a blueprint or template in Java.
//How to Define a Class in Java?
//Basic Syntax:
class ClassName {
    // fields (variables)
    // methods (functions)
}

//eg - Let’s create a class called Car:
class Car {

    //Data members (variables/fields)
    String brand;
    int year;

    //Behaviours (methods)
    void show() {
        System.out.println("Brand " + brand);
        System.out.println("Year " + year);
    }
}

//→ Create Object From Class
class DemoCar {

    public static void main(String[] args) {
        //create object
        Car Mycar = new Car();

        //set values to variables
        Mycar.brand = "Toyota";
        Mycar.year = 2025;

        //calling method
        Mycar.show();

    }
}

//2.Object.
//1. What is an Object?
/*
Object → A runtime entity that:
Represents a real-world entity (e.g. person, car, bank account).
Has state (data) and behavior (methods).
Identity (reference) → memory address that uniquely identifies the object
Objects are instances of classes.
 */

 /*
2. Object’s State and Behavior
State → stored in fields (variables).
Behavior → defined by methods.
 */
// How to Create an Object
//Syntax

/*
ClassName objectName = new ClassName();
 */
 /*
new keyword → allocates memory for the object.
Constructor → initializes the object.
 */
//Example of Creating and Using Objects
//Let’s create a class and an object.
class Cars {

    String brand;
    int year;

    void start() {
        System.out.println("Brand :" + brand + " year : " + year);
    }
}

class demoCars {

    public static void main(String[] args) {

        // Creating an object
        Cars myCar1 = new Cars();

        //Assign Values
        myCar1.brand = "Porshe 911";
        myCar1.year = 2008;

        myCar1.start(); //Brand: Porshe 911 Year: 2008

        // Multiple Objects
        // Each object has its own state.
        Cars myCar2 = new Cars();

        //Assign Values
        myCar2.brand = "Bugatti Chiron";
        myCar2.year = 2012;

        myCar2.start(); //Brand: Bugatti Chiron Year: 2012

        //How Objects Work in Memory
        //When you write:
        //Car myCar = new Car();
        /*
          Memory is allocated for the object.
          myCar stores the reference to the object, not the object itself.
         */
        //Object References 
        //Two references can point to the same object
        Cars carA = new Cars();
        carA.brand = "Proshe";

        Cars carB = carA;
        carB.brand = "Bugatti";

        System.out.println(carA.brand); // Bugatti
        // Both carA and carB point to the same object.

        // Anonymous Objects
        //Objects created without a reference variable.
        new Cars().start();

    }
}

// Objects as Method Arguments
//Objects can be passed to methods.

class Cars1 {
    String brand ;
}
class Printer {

    void printCar(Car c) {
        System.out.println(c.brand);
    }
}

class DemoPrinter {
    public static void main(String[] args) {
        Cars1 c1 = new Cars1();
           c1.brand = "Toyota";

           Printer p1 = new Printer();
           p1.printCar(c1);  // Toyota
    }

}

// Objects as Return Values
//Methods can return objects.


class Car2 {
       String brand;
}
class CarFactory {
    Car2 createCar(String name) {
             Car2 c2 = new Car2();
             c2.brand = name;
             return c2;
    }
}


class DemoCar2 {
    public static void main (String [] args) {
        CarFactory cf1 = new CarFactory();
        Car2 newCar = cf1.createCar("BMW");
        System.out.println(newCar.brand); //BMW
    }
}
//Object Creation Using Constructor
// A Constructor Helps Initialize Objects;

class Car3 {
    String brand;
    int year;


    Car3(Strign b, int y) {
        brand = b;
        year = y;
    } 

    void start () {
        System.out.println(brand + "Brand");
    }
}

class DemoCar3 {
    public static void main (String [] args) 
    {
        Car3 c3 = new Car3("Kia", 20022);
         c3.show(); // kia Brand

    }
}

//Garbage Collection 
// in java object without references become eligible for garbage
//collection
//example

class car4 {
    String brand;
}

class DemoCar4 [
    public static void main (String [] args) {
        Car4 c4 = new Car4();
        c4 = null; //
    }
]