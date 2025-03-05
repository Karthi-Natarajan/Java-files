import java.util.Scanner;

public class UnitDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        System.out.println("Unit digit: " + (num % 10));
        scanner.close();
    }
}
