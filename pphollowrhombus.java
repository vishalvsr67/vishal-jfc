import java.util.Scanner;

public class pphollowrhombus   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();
        for(int i = 1; i <= n; i++){
            //spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            //first and last row fully filled  
            if(i == 1 || i == n){
                for(int j = 1; j <= n; j++){
                    System.out.print("*"+" ");
                }
            } else {
                // Hollow middle part
            System.out.print("*"); // First star
            for (int j = 1; j <= n - 2; j++) {
                System.out.print("  ");
            }
            System.out.print(" *"); // Last star
            }
            System.out.println();
        }
    }
}
