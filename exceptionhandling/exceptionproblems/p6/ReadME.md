# Exception Handling Example

This example demonstrates basic exception handling in Java, specifically:

* **IllegalArgumentException:** Thrown when the input class name is empty.
* **ClassNotFoundException:** Thrown when the specified class cannot be found.

**Code Structure:**

* **ParentClass:**
    * `loadingClass(String name)`: 
        * Attempts to load the class using `Class.forName(name)`.
        * Catches `ClassNotFoundException` and prints an error message.

* **ChildClass:**
    * `main(String[] args)`:
        * Creates an instance of `ChildClass`.
        * Calls `loadingClass(args[0])`.
        * Includes a `try-catch` block to handle `IllegalArgumentException`.
    * `loadingClass(String name)`:
        * Overrides the parent class method.
        * Checks if the input `name` is empty.
        * Throws an `IllegalArgumentException` if the name is empty.

**How to Run:**

1. Save the code as `ChildClass.java` and `ParentClass.java` in the same directory.
2. Compile the code using a Java compiler:
   ```bash
   javac ChildClass.java ParentClass.java

3. Run the program with a class name as an argument:
Bash

java ChildClass java.lang.String
Or
java ChildClass com.example.MyClass

Expected Output:

If the class name is valid: The program will attempt to load the class. If successful, no output will be displayed.
If the class name is empty:
Class name cannot be empty
java.lang.IllegalArgumentException: Class name cannot be empty
at exceptionhandling.exceptionproblems.p6.exception.ChildClass.loadingClass(ChildClass.java:16)
at exceptionhandling.exceptionproblems.p6.exception.ChildClass.main(ChildClass.java:8)
If the class name is invalid (class not found):
Class Not Found!!
