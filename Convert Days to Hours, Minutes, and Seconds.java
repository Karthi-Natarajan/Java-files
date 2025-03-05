import java.util.Scanner;

public class TimeConversion {
    
    public static int multiply(int num, int factor) {
        int result = 0;
        for (int i = 0; i < factor; i++) {
            result += num;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of days: ");
        int days = scanner.nextInt();
        
    
        int hours = multiply(days, 24);
        int minutes = multiply(hours, 60);
        int seconds = multiply(minutes, 60);
        
        System.out.println(days + " days = " + hours + " hours = " + minutes + " minutes = " + seconds + " seconds");
        
        scanner.close();
    }
}

