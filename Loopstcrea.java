import java.util.*;
public class Loopstcrea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which u want to print the table: ");
        int n = sc.nextInt();
        System.out.println("Enter upto how many times you want the number to be printed: ");
        int j = sc.nextInt();
        for(int i = 1; i < j;i++){
            System.out.println(n*i);
        }
    }
    
}
