
import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int num = input.nextInt();
        int count= 0;
        for (int i = 2; i < num; i++) {
            if (num%i==0) {
                count++;
                break;
            }
        }
        if (count==0) {
            System.out.println("This Prime Number = ");
        }else{
            System.out.println("Not prime number");
    }
    }
    
}
