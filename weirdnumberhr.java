import java.util.*;

public class weirdnumberhr{



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        
        if(n%2!=0){
            System.out.println("Weird");
        }
        else if(n>=2 && n<=5 && n%2==0){
            System.out.println("Not Weird");
        }
        else if(n>=6 && n<=20 && n%2==0){
            System.out.println("Weird");
        }
        else if(n>20 && n<=100 && n%2==0){
            System.out.println("Not Weird");
        }
        else{
            System.out.println("number choosed is out of range");
        }
    }
}

        