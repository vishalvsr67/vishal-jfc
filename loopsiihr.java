import java.util.*;

public class loopsiihr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();  // Number of queries

        
        // Loop for each query
        for (int q = 0; q < t; q++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int sum = a;  // Start sum with 'a'
            
            // Generate series
            for (int i = 0; i < n; i++) {
                sum += Math.pow(2, i) * b;  // Compute term
                System.out.print(sum + " ");  // Print in same line
            }
            System.out.println();  // Move to new line after each query
        }
        
        in.close();  // Close scanner
    }
}
