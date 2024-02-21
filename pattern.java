
import java.util.Scanner;

public class pattern3 {

        public static void main(String[] args) {
            int rows = 4;
            int num = (rows * (rows + 1)) / 2;
    
            for (int i = 0; i < rows; i++) {
                int temp = num;
                for (int j = 0; j <= i; j++) {
                    System.out.print(temp + " ");
                    temp -= 1;
                }
                num -= (i + 1);
                System.out.println();
            }
        }
    }
    
    
