Markdown

# Exception Handling Example: Command Line Division

This code demonstrates exception handling in a Java program that performs division on two integers provided as command-line arguments.

**Key Exceptions Handled:**

* **ArithmeticException:** Occurs when attempting to divide by zero.
* **NumberFormatException:** Occurs when the command-line arguments cannot be parsed as integers.
* **IllegalArgumentException:** Occurs when the number of arguments provided is insufficient.

**Code Structure:**

* **CommandLineDivision:**
    * `main(String[] args)`:
        * Parses the command-line arguments (`args[0]` and `args[1]`) as integers.
        * Includes nested `try-catch-finally` blocks:
            * **Inner `try` block:**
                * Performs the division operation (`a / b`).
                * Prints the division result.
            * **Inner `catch` block (ArithmeticException):**
                * Catches `ArithmeticException` (division by zero).
                * Prints the exception message.
            * **`finally` block:**
                * Prints "Division operation completed" regardless of whether an exception occurred in the inner `try` block.
        * **Outer `catch` block (NumberFormatException):**
            * Catches `NumberFormatException` if the arguments cannot be parsed as integers.
            * Prints the exception stack trace.
        * **Outer `catch` block (IllegalArgumentException):**
            * Catches `IllegalArgumentException` if the number of arguments is insufficient.
            * Prints the exception stack trace.

**How to Run:**

1. Save the code as `CommandLineDivision.java`.
2. Compile the code using a Java compiler:
   ```bash
   javac CommandLineDivision.java
Run the program with two integer arguments:

Bash

java CommandLineDivision 10 2 
This will output:

Division Result :5.0
Division operation completed
Expected Output:

Valid input:
Division result is printed.
"Division operation completed" is printed in the finally block.
Division by zero:
"Division by 0" (or a similar message) is printed from the inner catch block.
"Division operation completed" is still printed from the finally block.
Invalid input (not integers):
The NumberFormatException stack trace is printed.
Insufficient arguments:
The IllegalArgumentException stack trace is printed.