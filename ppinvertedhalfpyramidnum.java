public class ppinvertedhalfpyramidnum {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i <= n; i++){
            //print the numbers in inverted format
            
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print(i);
              
            }
            System.out.println();
        }
    }
}
