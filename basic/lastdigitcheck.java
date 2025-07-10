import java.util.Scanner;
public class lastdigitcheck{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int lastDigit = Math.abs(number % 10);
        System.out.println("The last digit is "+ lastDigit);
    }
}