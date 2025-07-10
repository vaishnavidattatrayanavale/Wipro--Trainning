import java.util.Scanner;

class addno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        int lastdigit1 = Math.abs(num1 % 10);
        int lastdigit2 = Math.abs(num2 % 10);

        int addtwodigit = lastdigit1 + lastdigit2;
        System.out.println("Addition of two digits: " + addtwodigit);
    }
}
