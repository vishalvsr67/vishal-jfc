import java.util.*;
public class funtableofgivennum {
    public static void printTable (int n, int j) {
        for(int i = 1; i <= j; i++){
            System.out.println(n + "x" + i + "=" + (n*i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which you want to print the table: ");
        int n = sc.nextInt();
        System.out.println("Enter the number upto which you want to the print the table of the chosen number: ");
        int j = sc.nextInt();
        
        printTable(n,j);
    }
}
