# DivisionExample

This Java program demonstrates how to handle `ArithmeticException` in a division operation.

**Key Features:**

- **`performDivision` Method:**
    - Takes two integers as input (dividend and divisor).
    - Throws an `ArithmeticException` if the divisor is zero.
    - Returns the result of the division.

- **`main` Method:**
    - Prompts the user to enter the dividend and divisor.
    - Uses a `try-catch` block to handle potential `ArithmeticException`.
    - Prints the result of the division or an error message if the divisor is zero.
    - Includes a `finally` block to close the `Scanner` object.

**Test Cases:**

**Test Case 1:**

- **Input:**
    - Dividend: 10
    - Divisor: 2
- **Expected Output:**
    - Result of division: 5

**Test Case 2:**

- **Input:**
    - Dividend: 5
    - Divisor: 0
- **Expected Output:**
    - Error: Division by zero is not allowed.

This program effectively demonstrates exception handling for the `ArithmeticException` that occurs during division by zero.

**To run the program:**

1. Save the code as `DivisionExample.java`.
2. Compile the code using a Java compiler: `javac DivisionExample.java`
3. Run the program: `java DivisionExample`

This will prompt you to enter the dividend and divisor values.