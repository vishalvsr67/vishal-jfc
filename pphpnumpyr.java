public class pphpnumpyr{
    public static void main(String[] args) {
        int n = 5;
        int number = 1;
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop -> for spaces
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            //inner loop -> for printing numbers
            for(int j=1; j<=i; j++){
                System.out.print(number);
                number = number + i;
            }
            System.out.println();
        }
    }
}