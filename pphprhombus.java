public class pphprhombus{
    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop -> for spaces
            for(int j=1; j<=m-i; j++){
                System.out.print(" ");
            }
            //inner loop -> print star
            for(int j=1; j<=m; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}