
import java.util.Scanner;

public class tablecrealimitedhr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N >= 0 && N <= 20){
            for(int i = 1; i < 11; i++){
                int result = (N * i);
                System.out.println(N + " x " + i + " = " + (N * i));
            }
        }
        else{
            System.out.println("Invalid number choosed");
        }
    }
    
}
