import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while(choice != 5) {
            System.out.println("\n1.Add");
            System.out.println("2.Subtract");
            System.out.println("3.Multiply");
            System.out.println("4.Divide");
            System.out.println("5.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            if(choice == 5) {
                System.out.println("Thank You");
                break;
            }
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Result = " + (a + b));
                    break;
                case 2:
                    System.out.println("Result = " + (a - b));
                    break;
                case 3:
                    System.out.println("Result = " + (a * b));
                    break;
                case 4:
                    if(b != 0)
                        System.out.println("Result = " + (a / b));
                    else
                        System.out.println("Cannot divide by zero");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
        sc.close();
    }
}