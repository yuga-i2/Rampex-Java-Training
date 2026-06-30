import java.util.Scanner;
class ATMDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        int choice;
        do {
            System.out.println("\n1.Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Balance = " + balance);
                    break;
                case 2:
                    System.out.print("Deposit: ");
                    balance += sc.nextInt();
                    break;
                case 3:
                    System.out.print("Withdraw: ");
                    int amount = sc.nextInt();
                    if(amount <= balance)
                        balance -= amount;
                    else
                        System.out.println("Insufficient Balance");

                    break;
                case 4:
                    System.out.println("Thank You");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }

        } while(choice != 4);
        sc.close();
    }
}