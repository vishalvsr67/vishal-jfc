import java.util.Scanner;

class conditionoddeven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        if(x%2==0){
            System.out.println("The given number is even number");
        }
        else{
            System.out.println("The given number is odd number");
        }

    }

}

