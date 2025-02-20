public class ppinvertedhalfpyramidnum {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i <= n; i++){
            //print the numbers in inverted format
            int num = 1;
            for(int j = n; j >= 1; j++){
                System.out.print(num);
            }
            System.out.println();
        }
    }
    
}
