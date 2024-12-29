# User-Defined Functional Interfaces in Java

## Overview

This project demonstrates the creation and usage of two user-defined functional interfaces in Java: `Operation` and `Greeting`.

## Functional Interfaces

### Operation Interface
- **Method**: `perform(int a, int b)` returns an `int`.
- **Conditions**:
  1. If both `a` and `b` are greater than 0, return the sum of the squares of `a` and `b`.
  2. If the above condition is not met, return the sum of `a` and `b`.

### Greeting Interface
- **Method**: `greet(String name, int age)` returns `void`.
- **Conditions**:
  1. If the age is 18 or older, print a greeting indicating that the person is an adult.
  2. If the length of the name is greater than 5 and the age is less than 18, print a greeting indicating that the person has a long name and is not an adult yet.
  3. If none of the above conditions are met, print a suitable greeting.

## Main Method Implementation

### Using Anonymous Inner Class
- **Operation Interface**:
  - Create an instance using an anonymous inner class implementing the specified mathematical operations.
- **Greeting Interface**:
  - Create an instance using an anonymous inner class implementing the specified intricate logic.
- **Execution**:
  1. Perform a sample mathematical operation (e.g., `a = 4`, `b = 3`) and print the result.
  2. Perform a sample greeting operation (e.g., `age = 38`, `name = "Virat"`) and print the personalized message.

### Using Lambda Expressions
- **Operation Interface**:
  - Create an instance using a lambda expression implementing the specified mathematical operations.
- **Greeting Interface**:
  - Create an instance using a lambda expression implementing the specified intricate logic.
- **Execution**:
  1. Perform a sample mathematical operation (e.g., `a = 4`, `b = 3`) and print the result.
  2. Perform a sample greeting operation (e.g., `age = 38`, `name = "Virat"`) and print the personalized message.

## Conclusion

This project showcases how to define and implement user-defined functional interfaces in Java. The examples demonstrate the flexibility of using both anonymous inner classes and lambda expressions to implement specific logic based on given conditions.

Feel free to explore and modify the code as needed to better understand and utilize functional interfaces in Java!
