import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number : ");
        double a = sc.nextDouble();
        
        System.out.println("Enter the number : ");
        double b = sc.nextDouble();
        
        double sum = a + b;
        
        int int_part = 0;
        double temp = sum;
        
        while ( temp >= 1){
            temp -= 1;
            int_part ++;
            
        }
        double frac_part = sum - int_part;
        
        System.out.printf("Fraction part : %.4f%n ",frac_part);
        sc.close();
        
        
    }
}