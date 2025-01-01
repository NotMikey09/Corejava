# ArrayStoreException in Java

This Java program demonstrates the use of `ArrayStoreException` to handle cases where an array of a specific type (in this case, `String`) is attempted to store an incompatible type (e.g., `Integer`).

## Code Overview

The program consists of a class `ArrayStoreExample` with two methods:

1. **`storeObjects()`**: 
    - Creates an array of `Object` type containing elements of different types (`String` and `Integer`).
    - Iterates through the array and checks if each element is an instance of `String`.
    - If an element is not a `String`, it throws an `ArrayStoreException` with a custom error message.

2. **`main(String[] args)`**:
    - Calls the `storeObjects()` method within a `try-catch` block.
    - Catches the `ArrayStoreException` and prints the exception message.

## Code Explanation

```java
package com.example;

public class ArrayStoreExample {

    public static void storeObjects() {
        Object object[] = {"Hello", "Pratyush", 123}; 
        for (Object ob : object) {
            if (!(ob instanceof String)) { 
                throw new ArrayStoreException("java.lang.Integer cannot be stored in an array of java.lang.String");
            }
        }
        System.out.println("All elements are Strings."); 
    }

    public static void main(String[] args) {
        try {
            storeObjects();
        } catch (ArrayStoreException e) {
            System.err.println("ArrayStoreException occurred: " + e.getMessage()); 
        }
    }
}
Explanation:

storeObjects() method:

Creates an Object array named object containing a String, another String, and an Integer.
Iterates through each element in the object array using an enhanced for loop.
Inside the loop:
Checks if the current element (ob) is an instance of String using ob instanceof String.
If the element is not a String, it throws an ArrayStoreException with a specific message indicating the incompatible type.
If all elements are Strings, it prints a success message.
main() method:

Calls the storeObjects() method within a try-catch block.
The try block attempts to execute the storeObjects() method.
If an ArrayStoreException occurs during the execution of storeObjects(), the catch block will:
Print an error message indicating that an ArrayStoreException occurred.
Print the exception message provided by the ArrayStoreException object.
Key Points:

ArrayStoreException is a subclass of RuntimeException, so it's unchecked and doesn't need to be explicitly declared in the throws clause.
This example demonstrates how to handle ArrayStoreException gracefully to prevent unexpected program behavior.
This code effectively demonstrates how to handle ArrayStoreException when attempting to store incompatible objects in an array.