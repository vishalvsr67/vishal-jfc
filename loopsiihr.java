import java.util.*;

public class loopsiihr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();  // Number of queries

        if(q >= 0 || q <= 500){
            // Loop for each query
            for (int i = 0; i < q; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int sum = a;  // Start sum with 'a'
            if(a >= 0 || a <= 50 || b >= 0 || b <= 50 || n >= 1 || n <= 15){
                // Generate series
                for (int j = 0; j < n; j++) {
                sum += Math.pow(2, i) * b;  // Compute term
                System.out.print(sum + " ");  // Print in same line
            }
            System.out.println();  // Move to new line after each query}
            }
            else{
                System.out.println("Invalid range choosen!");
            }
        
            
        }
    }
    else{
        System.out.println("Invalid range choosen");
    }
    in.close();  // Close scanner
}
}