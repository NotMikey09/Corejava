# Rectangle Area Calculator with Exception Handling

This Java program calculates the area of a rectangle and handles invalid input using `IllegalArgumentException`.

**Key Features:**

* **`calculateArea` Method:**
    * Takes length and width as input.
    * Throws `IllegalArgumentException` if either length or width is non-positive.
    * Calculates and returns the area of the rectangle.

* **`main` Method:**
    * Prompts the user to enter length and width.
    * Uses a `try-catch` block to handle `IllegalArgumentException`.
    * Prints the calculated area or an error message.

**Test Cases:**

**Test Case 1: Valid Input**

* **Input:**
    * Length: 5
    * Width: 4
* **Expected Output:**
    * Area of rectangle with length 5 and width 4 is: 20.0

**Test Case 2: Invalid Input**

* **Input:**
    * Length: -3
    * Width: 6
* **Expected Output:**
    * IllegalArgumentException caught: Dimensions must be positive: length=-3, width=6

This program demonstrates effective exception handling for invalid input, ensuring the calculation of the rectangle's area is performed only with valid dimensions.