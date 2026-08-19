import java.util.Scanner;
class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] subject = new String[5];
        int[] mark = new int[5];
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter Subject " + (i + 1) + ": ");
            subject[i] = sc.next();
            System.out.print("Enter Mark: ");
            mark[i] = sc.nextInt();
        }
        System.out.println("\nSubjects and Marks");
        for(int i = 0; i < 5; i++) {
            System.out.println(subject[i] + " : " + mark[i]);
        }
        sc.close();
    }
}