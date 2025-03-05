import java.util.Scanner;

public class MSBDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        while (num >= 10) {
            num /= 10;
        }
        
        System.out.println("MSB: " + num);
        scanner.close();
    }
}
