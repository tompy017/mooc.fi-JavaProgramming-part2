
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Give a number:"); 
            int userInput = Integer.valueOf(scanner.nextLine());
            
            if (userInput < 0) {
                System.out.println("Unsuitable number");
                continue;
            } else if (userInput == 0) {
                break;
            } else {
                System.out.println(userInput * userInput);
            }
        }
    }
}