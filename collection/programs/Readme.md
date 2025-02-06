# Cab Customer Service Application

This application manages cab customer information and calculates their bills. It consists of three classes: `CabCustomer`, `CabCustomerService`, and `CabCustomerServiceTester`.

## Class: `CabCustomer`

This class represents a cab customer and stores their information.

**Private Attributes:**

*   `custId` (int): Customer ID
*   `customerName` (String): Customer Name
*   `pickupLocation` (String): Pickup Location
*   `dropLocation` (String): Drop Location
*   `distance` (int): Travel Distance (in kilometers)
*   `phone` (String): Phone Number

**Public Methods:**

*   **Getters and Setters:**  Standard getter and setter methods for all attributes are implemented.  For example:
    *   `int getCustId()`: Returns the customer ID.
    *   `void setCustId(int custId)`: Sets the customer ID.
    *   `String getCustomerName()`: Returns the customer name.
    *   `void setCustomerName(String customerName)`: Sets the customer name.
    *   *(And so on for all other attributes)*
*   **Constructors:**
    *   `CabCustomer()`: No-argument constructor.  Initializes the object with default values (usually 0 or null).
    *   `CabCustomer(int custId, String customerName, String pickupLocation, String dropLocation, int distance, String phone)`: Parameterized constructor initializing all attributes in the specified order.

**Code Example:**

```java
public class CabCustomer {
    // ... (attributes as defined above)

    public CabCustomer() { } // No-argument constructor

    public CabCustomer(int custId, String customerName, String pickupLocation, String dropLocation, int distance, String phone) {
        this.custId = custId;
        this.customerName = customerName;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.distance = distance;
        this.phone = phone;
    }

    // ... (Getters and setters for all attributes)
}
Class: CabCustomerService
This class manages a list of CabCustomer objects and provides services related to customer management and billing.

Private Attributes:

customerList (ArrayList&lt;CabCustomer>): A generic ArrayList to store CabCustomer objects.
Public Methods:

void addCabCustomer(CabCustomer customer): Adds the given customer object to the customerList.
boolean isFirstCustomer(CabCustomer customer): Checks if the given customer is a new customer. A customer is considered new if their phone number does not match any existing phone number in the customerList. Returns true if the customer is new, false otherwise.
double calculateBill(CabCustomer customer): Calculates and returns the customer's bill based on the following rules:
If the customer is new (determined using isFirstCustomer), return 0.0.
If the customer's travel distance is less than or equal to 4 km, return 80.0.
If the customer's travel distance is greater than 4 km, calculate the bill as 80.0 + (distance - 4) * 6.0.
String printBill(CabCustomer customer): Returns a formatted string representing the customer's bill. The format should be: [Customer Name] Please pay your bill of Rs.[Bill Amount]
Code Example:

Java

import java.util.ArrayList;

public class CabCustomerService {
    private ArrayList<CabCustomer> customerList = new ArrayList<>();

    public void addCabCustomer(CabCustomer customer) {
        customerList.add(customer);
    }

    public boolean isFirstCustomer(CabCustomer customer) {
        for (CabCustomer cust : customerList) {
            if (cust.getPhone().equals(customer.getPhone())) {
                return false;
            }
        }
        return true;
    }

    public double calculateBill(CabCustomer customer) {
       // ... (Logic as described above)
    }

    public String printBill(CabCustomer customer) {
        // ... (Logic as described above)
    }
}
Class: CabCustomerServiceTester
This class contains the main method, which is used to test the functionality of the CabCustomer and CabCustomerService classes.  You can create CabCustomer objects, add them to the CabCustomerService, and test the calculateBill and printBill methods.

Example Usage (in CabCustomerServiceTester):

Java

public class CabCustomerServiceTester {
    public static void main(String[] args) {
        CabCustomerService service = new CabCustomerService();

        CabCustomer customer1 = new CabCustomer(1, "JOHN", "Location A", "Location B", 4, "1234567890");
        service.addCabCustomer(customer1);
        System.out.println(service.printBill(customer1));

        // ... (Add more test cases)
    }
}
Note:  Ensure that you have the necessary imports for ArrayList (e.g., java.util.ArrayList).  The example usage demonstrates how to create customers, add them to the service, and print their bills.  You should expand this in your CabCustomerServiceTester class to thoroughly test all scenarios, including new customers, customers with varying distances, and edge cases.  Compile and run the CabCustomerServiceTester class to execute the application and see the results.






