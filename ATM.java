import java.util.Scanner;

public class ATM {
    private UserAccount userAccount;

    public ATM(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public void withdraw(double amount) {
        userAccount.withdraw(amount);
    }

    public void deposit(double amount) {
        userAccount.deposit(amount);
    }

    public void checkBalance() {
        userAccount.checkBalance();
    }

    public void userInterface() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to the ATM");
            System.out.println("1. Check Balance ⚖️");
            System.out.println("2. Deposit Money 💰");
            System.out.println("3. Withdraw Money 💸");
            System.out.println("4. Exit");
            System.out.print("Please select an option (1-4): ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid selection. Please try again.");
                    break;
            }
        }
    }
}
