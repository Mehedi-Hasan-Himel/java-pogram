
import java.util.Scanner;

public class EevenOdd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter Any Number =");
        num = input.nextInt();
        if (num%2==0) {
             System.out.println("This Number is  Even "+num);
             
        }else{
            System.out.println("This Number is Odd "+num);
        }
        
    }
    
}
