import java.util.Scanner;
class twonumcalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String operations = sc.nextLine();
        String operations = "additon,subtraction, multiplication, division, modulo";
        double addition = a + b;
        double subtraction = a - b;
        double multiplication = a * b;
        double division = a / b;
        double modulo = a % b;

        switch(operations){
            case 1: System.out.println(addition);
            break;
            case 2: System.out.println(addition);
            break;
            case 3: System.out.println(addition);
            break;
            case 4: System.out.println(addition);
            break;
            case 1: System.out.println(addition);
            break;
            case 1: System.out.println(addition);
            break;


        }        
    }
}