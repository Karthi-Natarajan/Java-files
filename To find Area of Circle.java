import java.util.Scanner;

public class Circlearea {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        
        System.out.println("Area of circle in double : "+area);
        
        int areaInt = (int)area;
        System.out.println("After casting to int : "+areaInt);
    }
}