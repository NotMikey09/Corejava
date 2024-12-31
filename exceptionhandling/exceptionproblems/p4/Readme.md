
# ClassNotFoundException Handling in Java

This Java program demonstrates how to handle `ClassNotFoundException` when using reflection to load a class.

**Key Features:**

* **`ClassNotFoundExpDemo` Class:**
    * Takes a class name as input.
    * Attempts to load the class using `Class.forName(className)`.
    * Catches `ClassNotFoundException` and prints an informative error message with the class name and stack trace.

* **`main` Method:**
    * Prompts the user to enter a class name.
    * Creates a `ClassNotFoundExpDemo` object to handle loading and potential exceptions.

**Code:**

```java
import java.util.Scanner;

public class ClassNotFoundExpDemo {

    public ClassNotFoundExpDemo(String className) {
        try {
            Class<?> clazz = Class.forName(className);
            System.out.println("Class " + className + " found: " + clazz.getName());
        } catch (ClassNotFoundException e) {
            System.err.println("Class " + className + " not found.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the class name to load: ");
            String className = scanner.nextLine();

            new ClassNotFoundExpDemo(className);
        }
    }
}
Test Cases:

Test Case 1: Valid Class

Input: java.lang.String
Expected Output:
Enter the class name to load: java.lang.String
Class java.lang.String found: java.lang.String
Test Case 2: Non-existent Class

Input: NonExistentClass
Expected Output:
Enter the class name to load: NonExistentClass
Class NonExistentClass not found.
java.lang.ClassNotFoundException: NonExistentClass
  at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
  ... (stack trace continues)
  
This program effectively demonstrates how to handle ClassNotFoundException to provide informative feedback when a class cannot be found using reflection.

