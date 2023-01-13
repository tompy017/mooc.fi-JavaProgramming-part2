
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float positivesTotal = 0;
        float positivesQty = 0;
        
        while (true) {
            float userInput = Integer.valueOf(scanner.nextLine());
            
            if (userInput == 0) {
                break;
            }
            
            if (userInput > 0) {
                positivesTotal += userInput;
                positivesQty += 1;
            }
        }
        
        if (positivesQty == 0){
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(positivesTotal / positivesQty);
        }    
    }
}
