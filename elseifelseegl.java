import java.util.Scanner;

class elseifelseegl{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if(a == b){
            System.out.println("equal");
       }
       else if(a > b){
             System.out.println("a is greater");
        }
        else{     
            if(a < b)
            System.out.println("a is lesser");
           }
     }
}

    