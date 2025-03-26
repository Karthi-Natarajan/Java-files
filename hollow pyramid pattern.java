public class HollowPyramid {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 0; i < n; i++) {
            // Printing spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Printing stars and spaces inside
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || j == 2 * i || i == n - 1) {
                    System.out.print("*"); // First, last star, or last row
                } else {
                    System.out.print(" "); // Hollow space
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
