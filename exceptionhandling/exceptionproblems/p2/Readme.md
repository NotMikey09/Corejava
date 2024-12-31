# ClassCastExceptionDemo

This Java program demonstrates how to handle `ClassCastException`.

**Key Features:**

- **`handleClassCastException` Method:**
    - Declares an array of `Object` type with elements of different types.
    - Iterates through the array and attempts to cast each element to `String`.
    - Uses a `try-catch` block to handle `ClassCastException`.
    - Prints informative error messages with the object's actual class name.
    - Prints the stack trace for debugging purposes.

- **`main` Method:**
    - Calls the `handleClassCastException` method to execute the casting and exception handling logic.

**Test Cases:**

**Test Case 1: Successful Casting**

Input: Objects: {"Hello", "World", "Java"}

Expected Output:
Casting successful: Hello
Casting successful: World
Casting successful: Java

**Test Case 2: Unsuccessful Casting**

Input: Objects: {"Hello", 123, "Java"}

Expected Output:
Casting successful: Hello
ClassCastException: Cannot cast java.lang.Integer to String.
java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
at ClassCastExceptionDemo.handleClassCastException(ClassCastExceptionDemo.java:16)
at ClassCastExceptionDemo.main(ClassCastExceptionDemo.java:28)


**Test Case 3: Mixed Types**

Input: Objects: {"Hello", true, "Java"}

Expected Output:
Casting successful: Hello
ClassCastException: Cannot cast java.lang.Boolean to String.
java.lang.ClassCastException: java.lang.Boolean cannot be cast to java.lang.String
at ClassCastExceptionDemo.handleClassCastException(ClassCastExceptionDemo.java:16)
at ClassCastExceptionDemo.main(ClassCastExceptionDemo.java:28)
Casting successful: Java


This program effectively demonstrates how to handle `ClassCastException` that occurs when attempting to cast an object to an incompatible type. The error message provides clear information about the casting failure and the object's actual class.
