public class pphalowbutterfly{
    public static void main(String[] args) {
        int n = 5;
        //first half
        for(int i=1; i <= n; i++){
            //first part
            int fplimit = (n-(3*i));
            for(int j = 1; j <= fplimit; j++){
                System.out.println("*");
                //firstpart inner firstpart
                for(int k = 1; k <= j; k++){
                    //fpinnerfp
                    for(int l = 1; l <= k; l++){ 
                        System.out.println("*");
                    }
                   //firstpart inner spaces
                    int fpispaces = (i-2);
                    for(int l = 1; l <= fpispaces; l++){
                        System.out.println(" ");
                    }
                    for(int l = 1; l <= k; l++){
                        System.out.println("*");
                    }
                 }
            }
            //spaces for hallow butterfly
            int spaces = 2*(n-i);
            for(int j = 1; j <= spaces; j++){
                System.out.println(" ");
            }
            //second part
            int splimit = (n-(3*i));
            for(int j = 1; j <= splimit; j++){
                System.out.println("*");
                //secondpart inner secondpart
                for(int k = 1; k <= j; k++){
                    //spinnersp
                    for(int l = 1; l <= k; l++){ 
                        System.out.println("*");
                    }
                   //secondpart inner spaces
                    int fpispaces = (i-2);
                    for(int l = 1; l <= fpispaces; l++){
                        System.out.println(" ");
                    }
                    for(int l = 1; l <= k; l++){
                        System.out.println("*");
                    }
                 }
            }
        }


        //second half
        for(int i=n; i >= 1; i--){
            //first part
            int fplimit = (n-(3*i));
            for(int j = 1; j <= fplimit; j++){
                System.out.println("*");
                //firstpart inner firstpart
                for(int k = 1; k <= j; k++){
                    //fpinnerfp
                    for(int l = 1; l <= k; l++){ 
                        System.out.println("*");
                    }
                   //firstpart inner spaces
                    int fpispaces = (i-2);
                    for(int l = 1; l <= fpispaces; l++){
                        System.out.println(" ");
                    }
                    for(int l = 1; l <= k; l++){
                        System.out.println("*");
                    }
                 }
            }
            //spaces for hallow butterfly
            int spaces = 2*(n-i);
            for(int j = 1; j <= spaces; j++){
                System.out.println(" ");
            }
            //second part
            int splimit = (n-(3*i));
            for(int j = 1; j <= splimit; j++){
                System.out.println("*");
                //secondpart inner secondpart
                for(int k = 1; k <= j; k++){
                    //spinnersp
                    for(int l = 1; l <= k; l++){ 
                        System.out.println("*");
                    }
                   //secondpart inner spaces
                    int fpispaces = (i-2);
                    for(int l = 1; l <= fpispaces; l++){
                        System.out.println(" ");
                    }
                    for(int l = 1; l <= k; l++){
                        System.out.println("*");
                    }
                 }
            }

    }
    }
}