import java.util.Scanner;
class Twonumcalculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //taking input for two numbers
        System.out.println("Enter the first number (a): ");
        double a = scanner.nextDouble();
        System.out.println("Enter the second number (b): ");
        double b = scanner.nextDouble();
        
        System.out.println("choose the operation to perform");
        System.out.println("1: + (addition)");
        System.out.println("2: - (subtration)");
        System.out.println("3: * (multiplication)");
        System.out.println("4: / (division)");
        System.out.println("5: % (modulo)");

        System.out.print("choose the choice from(1-5):");
        int choice = scanner.nextInt();

        double result;

        switch(choice){
            case 1: 
                result = a + b;
                System.out.println("Result of addition:"+result);
            break;
            case 2:
                result = a - b; 
                System.out.println("Result of subtraction:"+result);
            break;
            case 3:
                result = a * b;
                System.out.println("Result of multiplication:"+result);
            break;
            case 4: 
            result = a / b;
            System.out.println("Result of division:"+result);
            break;
            case 5:
            result = a % b;
            System.out.println("Result of modulo:"+result);
            break;
            default: System.out.println("Invalid choice");
            }        
    }

}