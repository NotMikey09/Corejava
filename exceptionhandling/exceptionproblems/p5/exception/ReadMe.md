# ArrayStoreExample

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

### `storeObjects()` Method
```java
public static void storeObjects() {
    Object object[] = {"Hello", "Pratyush", 123};
    for (Object ob : object) {
        if (!(ob instanceof String)) {
            throw new ArrayStoreException("java.lang.Integer cannot be stored in an array of java.lang.String");
        }
    }
}