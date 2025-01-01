# Car Exception Handling in Java

This project demonstrates exception handling in Java by simulating various car-related issues using custom exception classes.

**Exception Classes:**

* **CarStoppedException:**
    * Extends `Exception`.
    * Represents an exception when the car stops for reasons other than puncture or overheating.
    * Has a parameterized constructor that accepts a String message.

* **CarPunctureException:**
    * Extends `Exception`.
    * Represents an exception when the car has a puncture.
    * Has a parameterized constructor that accepts a String message.

* **CarHeatException:**
    * Extends `Exception`.
    * Represents an exception when the car engine's temperature exceeds 50 degrees Celsius.
    * Has a parameterized constructor that accepts a String message.

**CarTest Class:**

* Contains static methods to simulate car operations and throw exceptions based on conditions.
* **stop(String):**
    * Throws `CarStoppedException` if the input string is "stop".
    * Prints "Car not stalled" otherwise.
* **puncture(String):**
    * Throws `CarPunctureException` if the input string is "puncture".
    * Prints "Car not punctured" otherwise.
* **carHeat(int):**
    * Throws `CarHeatException` if the input temperature is greater than 50 degrees Celsius.
    * Prints "Car temperature normal" otherwise.

**CarUser Class:**

* Invokes the `stop`, `puncture`, and `carHeat` methods from the `CarTest` class with appropriate arguments to test different scenarios.
* Demonstrates how to catch and handle the custom exceptions.

**Test Cases:**

* **Car Stopped Exception:** 
    * `CarTest.stop("stop")`: Should throw `CarStoppedException` with the message "Car stopped for some reason."
* **Car Not Started:**
    * `CarTest.stop("go")`: Should print "Car not stalled."
* **Car Puncture Exception:**
    * `CarTest.puncture("puncture")`: Should throw `CarPunctureException` with the message "Car is punctured."
* **Car Not Punctured:**
    * `CarTest.puncture("move")`: Should print "Car not punctured."
* **Car Overheating Exception:**
    * `CarTest.carHeat(60)`: Should throw `CarHeatException` with the message "Car is heated more than 50 degrees Celsius."
* **Car Temperature Normal:**
    * `CarTest.carHeat(40)`: Should print "Car temperature normal."

**How to Run:**

1. Save the code as `CarStoppedException.java`, `CarPunctureException.java`, `CarHeatException.java`, `CarTest.java`, and `CarUser.java`.
2. Compile the code using a Java compiler:
   ```bash
   javac CarStoppedException.java CarPunctureException.java CarHeatException.java CarTest.java CarUser.java
Run the CarUser class:
Bash

java CarUser 
This README file provides a brief overview of the car exception handling project. For detailed implementation and code examples, please refer to the source code files.






