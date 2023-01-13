
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numbersCount = 0;
        int sumOfNumbers = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int userInput = Integer.valueOf(scanner.nextLine());
            
            if (userInput == 0) {
                break;
            } else {
                numbersCount += 1;
                sumOfNumbers += userInput;
            }
        }
        System.out.println("Number of numbers: " + numbersCount);
        System.out.println("Sum of the numbers: " + sumOfNumbers);
    }
}
