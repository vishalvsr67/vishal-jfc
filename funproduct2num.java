import java.util.*;
public class funproduct2num {
     public static int calculateProduct(int a, int b){
    return a * b;
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateProduct(a,b);
        System.out.println("Product of two numbers is :"+ calculateProduct(a,b));
    }
}


