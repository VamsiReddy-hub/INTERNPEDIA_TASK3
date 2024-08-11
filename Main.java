public class Main {
    public static void main(String[] args) {
        // Create a user account with an initial balance
        UserAccount userAccount = new UserAccount(100);

        // Create an ATM connected to the user account
        ATM atm = new ATM(userAccount);

        // Run the ATM interface
        atm.userInterface();
    }
}
