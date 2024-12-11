import java.util.*;
class CircleCalculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        double radius = scanner.nextDouble();

        double circumference = 2 * Math.PI * radius;

        double area = Math.PI * Math.pow(radius,2);

        System.out.printf("The circumference of the circle with radius %.2f is: %.2f\n",radius,circumference);
        System.out.printf("The area of the circle with radius %.2f is: %.2f",radius,area);
    }
}