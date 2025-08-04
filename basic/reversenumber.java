import java.util.Scanner;
public class reversenumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in) ;
       System.out.println("Enter NUmber:");
       int num = sc.nextInt();
       int reverse = 0;
       while(num>0){
        int lastdigit = num % 10;
        reverse   = (reverse*10+lastdigit);
        num = num /10;


       }
       System.err.println("Reverse Number is :" + reverse);
    }
    
}
