
import java.util.Scanner;



public class FromParameterToOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int last = Integer.valueOf(scanner.nextLine());
        
        printFromNumberToOne(last);
    }
    
    
    public static void printFromNumberToOne(int number) {
        int start = number;
        
        for (int i = start; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
