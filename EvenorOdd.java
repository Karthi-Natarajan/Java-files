import java.util.Scanner;

public class EvenorOdd {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num+" IS AN EVEN NUMBER ");
        }else {
             System.out.println(num+" IS AN ODD NUMBER ");
            
        }
        sc.close();
    }
}