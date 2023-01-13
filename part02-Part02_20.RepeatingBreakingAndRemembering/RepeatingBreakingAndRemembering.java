
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int totalNumbers = 0;
        int evens = 0;
        int odds = 0;
        
        while (true) {
            System.out.println("Give numbers:");
            int userNumber = Integer.valueOf(scanner.nextLine());
            
            if (userNumber == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            
            if (userNumber % 2 == 0) {
                evens++;
            } else {
                odds++;
            }
            
            totalNumbers++;
            sum += userNumber;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + totalNumbers);
        System.out.println("Average: " + (1.0 * sum / totalNumbers));
        System.out.println("Even: " + evens);
        System.out.println("Odd: " + odds);
    }
}
