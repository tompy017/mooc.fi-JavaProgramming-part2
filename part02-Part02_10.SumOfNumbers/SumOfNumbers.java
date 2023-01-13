
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfNumbers = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int userInput = Integer.valueOf(scanner.nextLine());
            
            sumOfNumbers += userInput;
            
            if (userInput == 0) {
                break;
            }
        }
        // Prints the sum of every number that was given
        System.out.println("Sum of the numbers: " + sumOfNumbers);
    }
}
