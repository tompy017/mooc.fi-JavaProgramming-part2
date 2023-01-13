
import java.util.Scanner;



public class FromOneToParameter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int repeat = Integer.valueOf(scanner.nextLine());
        
        printUntilNumber(repeat);

    }
    
    public static void printUntilNumber(int number) {
        int start = 1;
        int end = number;
        
        for(int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }

}
