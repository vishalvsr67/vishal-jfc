import java.util.*;
public class studmarksmedowh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;//variable to store the user choice
            

            do {
                System.out.println("You are welcome to the students marks menu");
                System.out.println("Enter the marks of the student(0-100): ");
                int marks = sc.nextInt();
                if(marks >= 90 && marks <= 100){
                    System.out.println("This is good");
                }
                else if(marks >= 60 && marks <= 89){
                    System.out.println("This is also good");
                }
                else if(marks >=0 && marks <= 59){
                    System.out.println("This is good as well");
                }
                else{
                    System.out.println("Invalid marks! Please enter between 0-100.");
                }

                //Asking the user if they want to continue
                System.out.println("Want to continue? (yes(1) / no(0))");
                input = sc.nextInt();
            } while (input == 1);
            
            System.out.println("Thank you for using the students marks menu");
            sc.close(); //close scanner to avoid memory leak
    }
}

    

