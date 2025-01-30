import java.util.Scanner;
public class weirdnumberhr{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        if(n%2!=0){
            System.out.println("Weird");
        }
        else if(n>2 && n<5 && n%2==0){
            System.out.println("Not Weird");
        }
        else if(n>6 && n<20 && n%2==0){
            System.out.println("Weird");
        }
        else if(n>20 && n<100 && n%2==0){
            System.out.println("Not Weird");
        }
        else{
            System.out.println("number opted for checking is out of range");
        }
    }
}
