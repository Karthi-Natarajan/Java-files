import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the date ");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        
        LocalDate birthdate = LocalDate.of(y,m,d);
        LocalDate today = LocalDate.now();
        
        int age = Period.between(birthdate,today).getYears();
        System.out.println("Age "+age);
        sc.close();
    }
}