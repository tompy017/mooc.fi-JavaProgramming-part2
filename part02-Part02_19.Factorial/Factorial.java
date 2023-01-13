
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = 1;
        
        System.out.print("Give a number: ");
        int userNumb = Integer.valueOf(scanner.nextLine());
        
        // Factorial of 0 (0!) = 1
        if (userNumb == 0) {
            factorial = 1;
        } else {
            for (int i = 1; i<= userNumb; i++) {
                factorial *= i;
            }
        }
        
        System.out.println("Factorial: " + factorial);
    }
}
        

