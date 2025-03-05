import java.util.Scanner;

public class SumRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter M: ");
        int M = scanner.nextInt();
        
        System.out.print("Enter N: ");
        int N = scanner.nextInt();
        
        int sum = 0;
        for (int i = M; i <= N; i++) {
            sum += i;
        }
        
        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
