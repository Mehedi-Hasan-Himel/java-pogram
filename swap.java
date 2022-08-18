import java.util.Arrays;
    public class  swap{
    public static void main(String[] args) {
        
        int[] number = {23,33,21,2,400,34};
        
        Arrays.sort(number);
        
        for (int i = 0; i < 6; i++) {
            System.out.print(" "+number[i]);
        }
    }
}

