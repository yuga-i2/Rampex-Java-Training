import java.util.Scanner;
class Insta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Instagram ID: ");
        String id = sc.next();
        for(int i = 0; i < id.length(); i++) {
            char ch = id.charAt(i);
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                System.out.print(ch);
            }
        }
        sc.close();
    }
}