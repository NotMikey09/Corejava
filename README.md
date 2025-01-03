# Core Java: Functional Interfaces, Exception Handling, and Multithreading

**Author:** Pratyush

This document provides a brief overview of key Core Java concepts: Functional Interfaces, Exception Handling, and Multithreading.

**Note:** To understand the specific implementation details of a Java program, always refer to the README file within the respective program's folder. 

**1. Functional Interfaces**

* **Definition:** A functional interface is an interface that contains only one abstract method. 
* **Key Features:**
    * Enables concise code using lambda expressions.
    * Examples: `Runnable`, `Callable`, `Predicate`, `Consumer`, `Function`, `Supplier`
* **Benefits:**
    * Improved code readability and conciseness.
    * Enhanced code maintainability.
    * Facilitates functional programming paradigms.

**2. Exception Handling**

* **Purpose:** To gracefully handle unexpected events (errors) during program execution.
* **Key Mechanisms:**
    * **`try-catch-finally` block:** 
        * `try`: Encloses the code that might throw an exception.
        * `catch`: Handles specific exceptions that might occur within the `try` block.
        * `finally`: Code that always executes, regardless of whether an exception occurred.
    * **`throws` keyword:** Declares that a method may throw a particular exception.
    * **`throw` keyword:** Explicitly throws an exception.
    * **`Exception` class hierarchy:** Provides a structured way to classify and handle different types of exceptions.

* **Benefits:**
    * Prevents program crashes.
    * Improves program stability and robustness.
    * Allows for graceful error recovery.

**3. Multithreading**

* **Definition:** The concurrent execution of multiple threads within a single process.
* **Key Concepts:**
    * **Thread:** A unit of execution within a process.
    * **Concurrency:** Multiple threads executing concurrently, potentially sharing resources.
    * **Synchronization:** Mechanisms to control access to shared resources and prevent race conditions.
* **Benefits:**
    * Improved application responsiveness.
    * Enhanced performance in multi-core systems.
    * Ability to handle multiple tasks simultaneously.

**Example (Illustrating Lambda Expression with a Functional Interface):**

```java
interface MyInterface {
    String greet(String name);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Using lambda expression
        MyInterface greeting = name -> "Hello, " + name + "!"; 
        String result = greeting.greet("World");
        System.out.println(result); // Output: Hello, World!
    }
}