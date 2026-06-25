import java.util.Scanner;
class For {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
int n = sc.nextInt();
int sum = 1;
for(int i = 2; i <= 10; i=i+2) {
sum *= i;
}
System.out.print(sum);
sc.close();
}
}