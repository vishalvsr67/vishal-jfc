public class pppalindromepy {
    public static void main(String[] args) {
        int n = 5;
        //outer loop
        for(int i = 1; i <= n; i++){
            //inner loop
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            //inner loop
            for(int j = i; j >= 1; j--){
                System.out.print(j+" ");
            }
            for(int j = 2; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
