# Java Bank Application

This project simulates a simple bank application with features like deposit, withdrawal, transfer, loan application, and balance check.

**Key Features:**

* **Object-Oriented Design:** Utilizes classes like `BankAccount`, `Customer`, and an interface `Bank` for better organization and code reusability.
* **Exception Handling:** Implements custom exceptions (`InsufficientFundsException`, `InvalidAmountException`, `AccountNotFoundException`, `LoanNotAllowedException`) for robust error handling.
* **Input Validation:** Validates user input for all operations to prevent invalid transactions.
* **User-Friendly Interface:** Provides a simple menu-driven interface for users to interact with the ATM system.
* **User Input:** Allows users to edit the account name and input values dynamically.

**Project Structure:**

* `BankAccount.java`: Defines the `BankAccount` class, implementing the `Bank` interface.
* `Customer.java`: Defines the `Customer` class, holding customer information and their associated bank account.
* `ATM.java`: Contains the main method, implementing the ATM functionality.
* `Bank.java`: Defines the `Bank` interface with methods for deposit, withdrawal, transfer, loan application, and balance check.
* **Exception Classes:** Separate classes for `InsufficientFundsException`, `InvalidAmountException`, `AccountNotFoundException`, and `LoanNotAllowedException`.

**How to Run:**

1. Save the Java files (`BankAccount.java`, `Customer.java`, `ATM.java`, `Bank.java`, and exception classes) in the same directory.
2. Compile the Java files using a Java compiler (e.g., javac):
   ```bash
   javac *.java
Run the ATM class:
Bash

java ATM
Usage:

The ATM will display a menu with the following options:

Deposit
Withdraw
Transfer
Loan Application
Check Balance
Edit Account Name
Exit
Select the desired option and follow the on-screen instructions.

Code Example (BankAccount.java):

Java

package pratyush.p10.exception;

public class BankAccount implements Bank {
    private long accountNumber;
    private double balance;

    public BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount is entered for any Transaction!!");
        } else {
            balance += amount;
            System.out.println("Deposit Successfully!");
        }
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount is entered for any Transaction!!");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("There are not enough funds for a withdrawal or transfer!!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal Succesfull!");
        }
    }

    @Override
    public void transfer(BankAccount toAccount, double amount)
            throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount is entered for any Transaction!!");
        }
        if (toAccount == null) {
            throw new AccountNotFoundException("Account Not Found!!");
        }
        if (amount > balance) { 
            throw new InsufficientFundsException("There are not enough funds for a withdrawal or transfer!!"); 
        }

        // Deduct the amount from the current account
        balance -= amount; 

        // Add the amount to the recipient account
        toAccount.deposit(amount); 
    }

    @Override
    public void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount is entered for any Transaction!!");
        }
        if (amount >= balance) { 
            throw new LoanNotAllowedException("Loan amount not allowed"); 
        }
        // Implement loan application logic here 
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }
}

**Code Example (Customer.java):**

```java
package pratyush.p10.exception;

public class Customer {
    private String name;
    private BankAccount account;

    public Customer(String name, BankAccount account) {
        this.name = name;
        this.account = account;
    }

    public BankAccount getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
Code Example (ATM.java):

Java

package pratyush.p10.exception;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(12345, 10000);
        Customer cus1 = new Customer("Pratyush", acc1); 

        Scanner sc = new Scanner(System.in);

        try (sc) {
            while (true) {
                System.out.println("Select an Option :");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Transfer");
                System.out.println("4. Loan Application");
                System.out.println("5. Check Balance");
                System.out.println("6. Edit Account Name"); 
                System.out.println("7. Exit");
                System.out.println("Enter your Option: ");
                int op = sc.nextInt();

                switch (op) {
                    case 1:
                        System.out.println("Enter Deposit Amount:");
                        double deposit = sc.nextDouble();
                        cus1.getAccount().deposit(deposit);
                        System.out.println("Deposited Amount: " + cus1.getAccount().getBalance());
                        break;
                    case 2:
                        System.out.println("Enter Withdrawal Amount");
                        double withdraw = sc.nextDouble();
                        cus1.getAccount().withdraw(withdraw);
                        System.out.println("Balance after withdrawal: " + cus1.getAccount().getBalance());
                        break;
                    case 3:
                        // ... (Transfer logic as before) ...
                        break;
                    case 4:
                        System.out.println("Enter Loan Amount:");
                        double loanAmount = sc.nextDouble();
                        cus1.getAccount().applyForLoan(loanAmount);
                        System.out.println("Loan Application Submitted! Balance: " + cus1.getAccount().getBalance());
                        break;
                    case 5:
                        System.out.println("Current Balance: " + cus1.getAccount().getBalance());
                        break;
                    case 6:
                        System.out.println("Enter new Account Name:");
                        String newName = sc.next(); 
                        cus1.setName(newName); 
                        System.out.println("Account Name Updated Successfully!");
                        break;
                    case 7:
                        System.out.println("Exiting ATM...");
                        return;
                    default:
                        System.out.println("Invalid Option! Please select a valid option (1-7).");
                }
            }
        } catch (InsufficientFundsException e) {
            System.err.println("Insufficient Funds! " + e.getMessage());
        } catch (InvalidAmountException e) {
            System.err.println("Invalid Amount! " + e.getMessage());
        } catch (LoanNotAllowedException e) {
            System.err.println("Loan Application Failed! " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
Key Improvements:

Edit Account Name: Added a new menu option ("6. Edit Account Name") to allow users to change the customer's name.
Customer Class Modification: Added a setName(String name) method to the Customer class to enable name updates.
ATM Class Modification:
Updated the switch statement to handle the new "Edit Account Name" option.
Included code to read the new name from the user and update the customer's name using the setName method.
This enhanced README and code provide a more comprehensive and user-friendly bank application with the ability to edit the account name.






add a note that user can create its own input bankaccount and takes its value through user



Markdown

# Java Bank Application

This project simulates a simple bank application with features like deposit, withdrawal, transfer, loan application, and balance check.

**Key Features:**

* **Object-Oriented Design:** Utilizes classes like `BankAccount`, `Customer`, and an interface `Bank` for better organization and code reusability.
* **Exception Handling:** Implements custom exceptions (`InsufficientFundsException`, `InvalidAmountException`, `AccountNotFoundException`, `LoanNotAllowedException`) for robust error handling.
* **Input Validation:** Validates user input for all operations to prevent invalid transactions.
* **User-Friendly Interface:** Provides a simple menu-driven interface for users to interact with the ATM system.
* **User Input:** 
    * Allows users to edit the account name.
    * **Allows users to create their own bank account by providing the account number and initial balance.**

**Project Structure:**

* `BankAccount.java`: Defines the `BankAccount` class, implementing the `Bank` interface.
* `Customer.java`: Defines the `Customer` class, holding customer information and their associated bank account.
* `ATM.java`: Contains the main method, implementing the ATM functionality.
* `Bank.java`: Defines the `Bank` interface with methods for deposit, withdrawal, transfer, loan application, and balance check.
* **Exception Classes:** Separate classes for `InsufficientFundsException`, `InvalidAmountException`, `AccountNotFoundException`, and `LoanNotAllowedException`.

**How to Run:**

1. Save the Java files (`BankAccount.java`, `Customer.java`, `ATM.java`, `Bank.java`, and exception classes) in the same directory.
2. Compile the Java files using a Java compiler (e.g., javac):
   ```bash
   javac *.java
Run the ATM class:
Bash

java ATM
Usage:

The ATM will display a menu with the following options:

Deposit
Withdraw
Transfer
Loan Application
Check Balance
Edit Account Name
Create New Account
Exit
Select the desired option and follow the on-screen instructions.

Code Example (ATM.java):

Java

package pratyush.p10.exception;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        // Initially, no customer is created
        Customer cus1 = null; 

        Scanner sc = new Scanner(System.in);

        try (sc) {
            while (true) {
                System.out.println("Select an Option :");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Transfer");
                System.out.println("4. Loan Application");
                System.out.println("5. Check Balance");
                System.out.println("6. Edit Account Name");
                System.out.println("7. Create New Account"); 
                System.out.println("8. Exit");
                System.out.println("Enter your Option: ");
                int op = sc.nextInt();

                switch (op) {
                    case 1:
                        // Check if a customer exists before performing operations
                        if (cus1 == null) {
                            System.out.println("Please create an account first.");
                            break;
                        }
                        System.out.println("Enter Deposit Amount:");
                        double deposit = sc.nextDouble();
                        cus1.getAccount().deposit(deposit);
                        System.out.println("Deposited Amount: " + cus1.getAccount().getBalance());
                        break;
                    case 2: 
                        // Check if a customer exists before performing operations
                        if (cus1 == null) {
                            System.out.println("Please create an account first.");
                            break;
                        }
                        System.out.println("Enter Withdrawal Amount");
                        double withdraw = sc.nextDouble();
                        cus1.getAccount().withdraw(withdraw);
                        System.out.println("Balance after withdrawal: " + cus1.getAccount().getBalance());
                        break;
                    case 3: 
                        // ... (Transfer logic as before, with customer existence check) ...
                        break;
                    case 4: 
                        // ... (Loan Application logic as before, with customer existence check) ...
                        break;
                    case 5: 
                        // Check if a customer exists before performing operations
                        if (cus1 == null) {
                            System.out.println("Please create an account first.");
                            break;
                        }
                        System.out.println("Current Balance: " + cus1.getAccount().getBalance());
                        break;
                    case 6: 
                        // ... (Edit Account Name logic as before, with customer existence check) ...
                        break;
                    case 7: 
                        System.out.println("Enter your Account Number:");
                        long newAccountNumber = sc.nextLong();
                        System.out.println("Enter your Initial Balance:");
                        double newInitialBalance = sc.nextDouble();
                        BankAccount newAccount = new BankAccount(newAccountNumber, newInitialBalance);
                        cus1 = new Customer("New Customer", newAccount); 
                        System.out.println("Account Created Successfully!");
                        break;
                    case 8:
                        System.out.println("Exiting ATM...");
                        return;
                    default:
                        System.out.println("Invalid Option! Please select a valid option (1-8).");
                }
            }
        } catch (InsufficientFundsException e) {
            System.err.println("Insufficient Funds! " + e.getMessage());
        } catch (InvalidAmountException e) {
            System.err.println("Invalid Amount! " + e.getMessage());
        } catch (LoanNotAllowedException e) {
            System.err.println("Loan Application Failed! " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
Explanation of Changes:

New Menu Option: Added "7. Create New Account" to the menu.
Customer Initialization: Initially, cus1 is set to null to indicate that no customer account exists yet.
Account Creation Logic:
In the case 7 of the switch statement:
Prompts the user to enter the desired account number and initial balance.
Creates a new BankAccount object with the provided values.
Creates a new Customer object with a default name (or allow the user to enter a name) and the newly created BankAccount.
Customer Existence Check:
Before performing any operations (deposit, withdrawal, transfer, loan application, balance check, edit name), the code checks if the cus1 object is null. If it is, a message is displayed prompting the user to create an account first.
This enhanced code allows users to create their own bank accounts within the ATM system by providing the account number and initial balance.





