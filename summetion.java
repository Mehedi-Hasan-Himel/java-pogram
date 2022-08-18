import java.util.Scanner;

public class summetion {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x, sum = 0, y;
        System.out.print("Enter number = ");
         sum = input.nextInt();
        for (int i = 0; i <5; i++) {    
            sum = sum + input.nextInt();
        }
        System.out.println("Total Sum is = "+sum);
        
        }
}
