
 import java.util.Scanner;


 public class gradeNumber {
    public static void main(String[] args) {
   
    Scanner input = new Scanner(System.in); 
        double sum = 0;
        
        
        double [] number = new double[5];
        System.out.println("Please enter your marks of subject = ");
        
        for (int i = 0; i < 5; i++) {
           number[i] = input.nextDouble();
           
        }
        for (int i = 0; i < 5; i++) {
            sum = sum + number[i];
        }
        System.out.println("Total Number you got = " + sum);
        double digit = sum / 5;
        System.out.println("Total Number of  your gotten Average = "+digit);
        
        
        //   double digit ;
        System.out.print("Enter your total average number = ");
        digit =  input.nextDouble();
        
        if (digit>80) {
            System.out.println("Grade is = A+");
        }else if(digit<80 && digit>=70){
            System.out.println("Grade is = A");
        }
        else if(digit<70 && digit>=60){
            System.out.println("Grade is = B");
            
        }else if(digit<60 && digit>=50){
            System.out.println("Grade is = C");
        }else if(digit<50 && digit>=40){
            System.out.println("Grade is = D");
        }else if(digit<40 && digit>=0){
            System.out.println("Your Grade is = F");
        }       
       
    }
}
