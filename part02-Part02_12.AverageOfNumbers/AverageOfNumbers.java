
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
// float type to get a result as a float type too
        float sumOfNumb = 0;
        float countOfNumb = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int userNumber = Integer.valueOf(scanner.nextLine());
            
            if (userNumber == 0) {
                break;
            } else {
                countOfNumb += 1;
                sumOfNumb += userNumber;
            }
            
        }
        
        if (countOfNumb != 0){
            System.out.println("Average of the numbers: " + (sumOfNumb / countOfNumb));  
        }
    }
}
