
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int start = Integer.valueOf(scanner.nextLine());
        int end = Integer.valueOf(scanner.nextLine());
        
        divisibleByThreeInRange(start, end);
        

    }
    
    
    
    public static void divisibleByThreeInRange(int beginning, int end) {
        
        // for loop between range of given args
        for (int i = beginning; i <= end; i++){
            // finding the divisibles by 3 to print
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }

}
