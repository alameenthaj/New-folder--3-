import java.util.Scanner;

public class sample {

    static int balance = 10000;
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int choice;

    do {
        System.out.println("\nATM");
        System.out.println("1. Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");
        System.out.println("Enter your choice:");

        choice = sc.nextInt();

        switch (choice) {
            case 1:
                checkBalance();
                break;

            case 2:
                withdraw(sc);
                break;

            case 3:
                deposit(sc);
                break;

            case 4:
                System.out.println("Thank you for using ATM");
                break;

            default:
                System.out.println("Invalid choice");
        }

    } while (choice != 4);

      sc.close();
    }
    public static void checkBalance() {
       System.out.println("Balance: " + balance);
    }
    public static void withdraw(Scanner sc){
        System.out.println("Enter the withdrawal amount:");
        int amount=sc.nextInt();
        if (amount>0 && amount<=balance) {
            balance = balance - amount;
            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    public static void deposit(Scanner sc){
        int amount;
        System.out.println("Enter the deposit amount:");
        amount = sc.nextInt();
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful");
            System.out.println("Updated balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
}
