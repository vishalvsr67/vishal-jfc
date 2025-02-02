import java.util.*;
public class paentilln{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = scanner.nextInt();
        
            for(int i=2; i<n; i=i+2){
                System.out.println(i);
            }
        }        
    }
