import java.util.*;
public class funeveodd {
    public static void checkIfEveOdd(int n){
        if(n % 2 == 0){
            System.out.println("the given number is even");
        }else{
            System.out.println("the given number is odd");
        }
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        checkIfEveOdd(n);
    }
}
