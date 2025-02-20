import java.util.Scanner;

public class pppascalstriangle {
    public static void printPascalsTriangle(int n) {
        int[][] triangle = new int[n][n];

        // Filling Pascal's Triangle
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }
        }

        // Printing Pascal's Triangle
        for (int i = 0; i < n; i++) {
            // Printing spaces for formatting
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            // Printing numbers
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        scanner.close();
        
        printPascalsTriangle(n);
    }
}
