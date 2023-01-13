
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        
        System.out.print("Last number? ");
        int lastNumb = Integer.valueOf(scanner.nextLine());
        
        for (int i = 1; i<= lastNumb; i++) {
            total += i;
        }
        
        System.out.println("The sum is " + total);
        
        
        

    }
}
