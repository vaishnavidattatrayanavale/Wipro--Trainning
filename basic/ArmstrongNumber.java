
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in) ;
       System.out.println("Enter NUmber:");
       int num = sc.nextInt();
       int sum = 0;
       int dup = num;
       while(num>0){
        int lastdigit = num % 10;
        sum = sum + (lastdigit *lastdigit *lastdigit);
        num = num /10;


       }
       if(sum==dup){
       System.out.println("This is Armstrong number");}
       else {
        System.out.println("This is  not Armstrong number");
       }
    }
    
}
