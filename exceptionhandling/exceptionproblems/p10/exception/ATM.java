package exceptionhandling.exceptionproblems.p10.exception;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(12345, 10000);
        BankAccount acc2 = new BankAccount(78919, 1000);
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
                System.out.println("6. Exit");
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
                        System.out.println("Enter Account Number to Transfer:");
                        long targetAccountNumber = sc.nextLong();
                        System.out.print("Enter amount to transfer :");
                        double transferAmount = sc.nextDouble();

                        // Find the target account
                        BankAccount targetAccount = null;
                        if (targetAccountNumber == acc2.getAccountNumber()) {
                            targetAccount = acc2; 
                        } 

                        if (targetAccount != null) {
                            // Check sender account balance before transfer
                            double senderBalanceBefore = cus1.getAccount().getBalance();

                            cus1.getAccount().transfer(targetAccount, transferAmount); 

                            System.out.println("Transfer Successful! New Balance: " + cus1.getAccount().getBalance());
                            System.out.println("Recipient Account Balance: " + targetAccount.getBalance()); 
                            System.out.println("Sender Account Balance Before Transfer: " + senderBalanceBefore); 
                        } else {
                            System.err.println("Target account not found!");
                        }

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
                        System.out.println("Exiting ATM...");
                        return;
                    default:
                        System.out.println("Invalid Option! Please select a valid option (1-6).");
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