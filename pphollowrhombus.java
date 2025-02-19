public class pphollowrhombus{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            //spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            if(i == 1 || i == n){
                for(int j = 1; j <= 5; j++){
                    System.out.print("*"+" ");
                }
            } else if(i > 1 || i < n){
                for(int j = 1; j <= i; j++){
                    System.out.print("*");
                }
                
                //spaces
                int spaces = (n - 2);
                for(int j = 1; j <= spaces; j++){
                    System.out.print(" ");
                }
                for(int j = 1; j <= i; j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
