import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of 100 INR notes: ");
        int n100 = sc.nextInt();
        
        System.out.print("Enter number of 500 INR notes: ");
        int n500 = sc.nextInt();
        
        System.out.print("Enter number of 1000 INR notes: ");
        int n1000 = sc.nextInt();
        
        int total = (n100*100) + (n500*500) + (n1000*1000);
        
        System.out.println("Total Amount : "+total);
        sc.close();
    }
}