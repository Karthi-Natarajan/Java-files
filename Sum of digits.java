import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Num = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = Num.nextInt();
        int sum = 0;
        
        while(num > 0){
            sum += num%10;
            num /= 10;
        }
        System.out.println("Sum of digits : "+sum);
        Num.close();
    }
}