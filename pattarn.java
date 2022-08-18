import java.util.Scanner;

public class pattarn {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please Enter Line Number : ");
        int l = input.nextInt();
        for (int row = 1; row <= l; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(" "+col);
            }
            System.out.println();
        }
    }
    
}
