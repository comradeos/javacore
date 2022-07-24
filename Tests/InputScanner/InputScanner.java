package Tests.InputScanner;
import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input: ");        
        
        int number = scanner.nextInt();
        scanner.close();
        
        System.out.println("Output: " + number);        
    }
}
