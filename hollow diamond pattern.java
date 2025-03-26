public class HollowDiamond {
    public static void main(String[] args) {
        int n = 5; 

       
        for (int i = 0; i < n; i++) {
           
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
        
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || j == 2 * i) {
                    System.out.print("*"); // First and last star
                } else {
                    System.out.print(" "); // Hollow space
                }
            }
            System.out.println();
        }

        // Lower half 
        for (int i = n - 2; i >= 0; i--) {
            // Spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Stars and spaces in between
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || j == 2 * i) {
                    System.out.print("*"); // First and last star
                } else {
                    System.out.print(" "); // Hollow space
                }
            }
            System.out.println();
        }
    }
}
