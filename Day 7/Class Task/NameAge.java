import java.util.Scanner;
class Person {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.println(name + " is " + age + " years old.");
        sc.close();
    }
}