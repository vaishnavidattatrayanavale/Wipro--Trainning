import java.util.Scanner;
public class Singledigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int Num = sc. nextInt();
        while(Num > 0){
           int LastDigit = Num % 10;
            System.out.println("last digit is" + LastDigit);
            Num = Num / 10;
        }

    }
    
}
