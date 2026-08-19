import java.util.Scanner;
import java.util.InputMismatchException;

public class Banking{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SbiAccount s1 = new SbiAccount();
        try {
            System.out.print("Enter amount to deposit: ");
            float amount = sc.nextFloat();
            s1.deposit(amount);
        }
        catch (InputMismatchException e) {

            System.out.println("Invalid input! Please enter a numeric value.");
        }
        catch (ArithmeticException e) {
            System.out.println("Enter positive amount value");
        }
        sc.close();
    }
}


interface rbi {
    public void deposit(float amount);
    public void withdraw(float withdraw);
    public void checkBalance();
}

class SbiAccount implements rbi {
    private String accName;
    private int accId;
    private float balance;
    private float fdBalance;
    private float max_amount = 10000;

    public float getMax_amount() {
        return max_amount;
    }

    public void setMax_amount(float amount) {
        max_amount = amount;
    }

    public String getName() {
        return accName;
    }

    public int getAccId() {
        return accId;
    }

    public float getBalance() {
        return balance;
    }

    public void setName(String Name) {
        accName = Name;
    }

    public void setAccId(int id) {
        accId = id;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void deposit(float amount, int accCode) {
        fdBalance = fdBalance + amount;
        System.out.println("Amount deposited in fd Account " + amount +
                " Remaining FD balance :" + fdBalance);
    }

    @Override
    public void deposit(float amount) {
        if (amount < 0) {
            throw new ArithmeticException();
        }
        balance = balance + amount;

        System.out.println("Amount deposited in " + accName +
                "'s Account Rs:" + amount +
                " Remaining balance : " + balance);
    }

    @Override
    public void withdraw(float amount) {
        if (amount >= 0) {
            if (amount <= max_amount) {
                if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Amount withdrawn " +
                            accName + "'s Account Rs:" + amount +
                            " Remaining balance : " + balance);
                } else {
                    System.out.println("Insufficient funds !!!");
                }
            } else {

                System.out.println("Entered amount exceeds the Limit");
            }

        } else {

            System.out.println("Invalid amount !!!");
        }
    }

    @Override
    public void checkBalance() {

        System.out.println("Main balance : " + balance);
        System.out.println("FD Balance : " + fdBalance);
    }

}