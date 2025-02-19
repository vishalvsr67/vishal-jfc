import java.util.Scanner;

public class pphollowbutterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();

        // Upper half
        for (int i = 1; i <= n; i++) {
            System.out.print("*"); // Left wing first star
            for (int j = 1; j < i - 1; j++) System.out.print(" "); // Hollow space
            if (i > 1) System.out.print("*"); // Left wing second star

            for (int j = 1; j <= (2 * (n - i)); j++) System.out.print(" "); // Center space

            System.out.print("*"); // Right wing first star
            for (int j = 1; j < i - 1; j++) System.out.print(" "); // Hollow space
            if (i > 1) System.out.print("*"); // Right wing second star
            System.out.println();
        }

        // Lower half
        for (int i = n; i >= 1; i--) {
            System.out.print("*"); // Left wing first star
            for (int j = 1; j < i - 1; j++) System.out.print(" "); // Hollow space
            if (i > 1) System.out.print("*"); // Left wing second star

            for (int j = 1; j <= (2 * (n - i)); j++) System.out.print(" "); // Center space

            System.out.print("*"); // Right wing first star
            for (int j = 1; j < i - 1; j++) System.out.print(" "); // Hollow space
            if (i > 1) System.out.print("*"); // Right wing second star
            System.out.println();
        }
    }
}
