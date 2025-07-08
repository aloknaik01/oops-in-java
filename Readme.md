# 🚀 Object-Oriented Programming (OOPs) in Java

> ✅ **Definition of OOPs:**

OOPs (**Object-Oriented Programming System**) is a programming paradigm in **Java** where software is designed around **objects** rather than functions. Objects represent **real-world entities** and have:

- 🗂 **State (data)** → stored in variables (fields)
- ⚙️ **Behavior (methods)** → defined by functions inside the class

OOPs promotes key principles:

- 🛡 **Encapsulation** – Hiding internal details and exposing only necessary parts
- 🧬 **Inheritance** – Creating new classes based on existing ones
- 🔁 **Polymorphism** – Same operation behaves differently on different classes
- 🎭 **Abstraction** – Hiding complexity and showing only essential features

These principles make programs:

✨ **Modular**  
♻️ **Reusable**  
🛠 **Maintainable**  
🌍 **Closer to real-life modeling**

---

# 🏗️ Class in Java

> ✅ **What is a Class in Java?**

A **class** is a **blueprint** or **template** in Java.

- It defines what **data (variables)** and what **actions (methods)** an object can have.
- A class **does not occupy memory** until objects are created from it.

🛠️ **Analogy:**  
Think of a class like a **design of a house** — it describes the structure, but no real house exists until you build one (an object).

---

# 🔹 How to Define a Class in Java

> ✅ **Basic Syntax of a Class**

In Java, you define a class using the `class` keyword, followed by the class name, and a pair of curly braces `{ }`.

Inside the class, you can declare:

- **Fields (variables)** → to store data
- **Methods (functions)** → to define actions or behaviors

---

## 📝 Syntax Template

```java
class ClassName {
    // fields (variables)
    // methods (functions)
}
```

### 📦 Let’s create a class called Car:
→ **Define the Class**
```java
class Car {
    String brand;
    int year;

    void show() {
        System.out.println("Brand" + brand);
        System.out.println("Year" + year);
    }
}
```
- brand and year are variables → represent the data or properties of a Car.

- displayDetails() is a method → defines the behavior of a Car.

→ **Create Object From Class**
- To use the class, we need to create an object:
```java
public class DemoCar {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyaota";
        myCar.year = 2015;
        myCar.show();
    }
}
```

> ⚙️ **How to Compile the Code**

Open your terminal or command prompt and navigate to the folder where Main.java is saved. Then run:

```java
javac oops.java
```

> ▶️ **How to Run the Code**

```java
java DemoCar
```

🖥️ **Output**

```java
Brand Toyota
Year 2025
```
