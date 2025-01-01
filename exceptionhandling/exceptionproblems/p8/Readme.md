# Financial Transaction System with Exception Handling

This program simulates a financial transaction system that takes user input for amount and account number, processes the transaction, and displays a success message. It incorporates exception handling to manage invalid user input and potential runtime errors.

**Code Structure:**

* **FinancialTransaction Class:**
    * `processTransaction(double amount, long accountNumber)`:
        * Validates the input amount and account number.
        * Throws an `IllegalArgumentException` if either value is less than or equal to zero.
        * Prints a success message upon successful transaction processing.
    * `main(String[] args)`:
        * Creates a `Scanner` object to read user input.
        * Uses a `try-with-resources` block to ensure proper resource management (closing the scanner).
            * Prompts the user to enter the transaction amount and account number.
            * Reads the user input for amount and account number.
            * Prints a message indicating transaction processing.
            * Calls `processTransaction` to perform the transaction.
        * Includes three `catch` blocks to handle different exceptions:
            * `NumberFormatException`: Catches invalid user input (non-numeric values).
                * Prints an error message requesting valid numeric input.
            * `IllegalArgumentException`: Catches invalid transaction amount or account number (non-positive values).
                * Prints an error message stating that both amount and account number must be greater than zero.
            * `RuntimeException`: Catches any other unexpected runtime exceptions.
                * Prints a generic error message and the exception stack trace for debugging purposes.

**Running the Program:**

1. Save the code as `FinancialTransaction.java`.
2. Compile the code using a Java compiler:
   ```bash
   javac FinancialTransaction.java
Run the program:
Bash

java pratyush.p8.exception.FinancialTransaction
The program will prompt you to enter the transaction amount and account number.
Expected Output:

Valid Input:
Enter the amount to transfer followed by account number:
100 1234567890
Transaction Processing....
Transaction Successful: Amount 100.0 transferred
Invalid Input (Non-numeric characters):
Enter the amount to transfer followed by account number:
abc 1234567890
Invalid input. Please enter a valid number for amount and account number!!!
Invalid Transaction Amount/Account Number (Non-positive values):
Enter the amount to transfer followed by account number:
-10 1234567890
Amount and Account Number should be greaer than 0
Runtime Exception (Unexpected error): // This is less likely to occur in this specific scenario but demonstrates the catch-all block functionality.
Enter the amount to transfer followed by account number:
100 1234567890
Transaction Processing....
Runtime exception occured
<exception stack trace will be printed here>
Note:

