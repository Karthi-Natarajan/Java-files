import java.util.Scanner;
public class Largestnum{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        System.out.print("Enter the number: ");
        int b = sc.nextInt();
        System.out.print("Enter the number: ");
        int c = sc.nextInt();
        
        int largest;
        
        if(a>=b){
            if(a>=c){
                largest = a;
            }else{
                largest = c ;
            }
            }else{
                if(b>=c){
                    largest = b;
                }else{
                    largest = c;
                }
            }
            System.out.println("The largest num is : "+largest);
        sc.close();
    }
}