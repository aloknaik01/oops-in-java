
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
