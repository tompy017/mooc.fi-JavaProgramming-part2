
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        
        System.out.print("First number? ");
        int first = Integer.valueOf(scanner.nextLine());
        
        System.out.print("Last number? ");
        int last = Integer.valueOf(scanner.nextLine());
        
        for (int i = first; i <= last; i++) {
            total += i;
        }
        
        System.out.println("The sum is: " + total);
    }
}
