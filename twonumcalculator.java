import java.util.Scanner;
class twonumcalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        sc.nextLine();
        String operations = "additon,subtraction, multiplication, division, modulo";
        double addition = a + b;
        double subtraction = a - b;
        double multiplication = a * b;
        double division = a / b;
        double modulo = a % b;

        switch(operations){
            case 1: System.out.println(addition);
            break;
            case 2: System.out.println(subtraction);
            break;
            case 3: System.out.println(multiplication);
            break;
            case 4: System.out.println(division);
            break;
            case 5: System.out.println(modulo);
            break;
            Default:
                    System.out.println("Invalid operation choosed");
            }        
    }
}