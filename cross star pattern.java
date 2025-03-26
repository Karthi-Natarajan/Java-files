public class CrossPattern {
    public static void main(String[] args) {
        int n = 5; // Cross size (must be odd)

        for (int i = 0; i < n; i++) { // Rows
            for (int j = 0; j < n; j++) { // Columns
                if (i == j || i + j == n - 1) { 
                    System.out.print("*"); // Print star at diagonals
                } else {
                    System.out.print(" "); // Print space elsewhere
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
