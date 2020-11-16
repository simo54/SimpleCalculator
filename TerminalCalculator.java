// Importing Scanner
import java.util.Scanner;

public class TerminalCalculator {

    public static void main(String[] args) {
        // Declaring new Scanner and boolean to make our calcolator running 
        Scanner input = new Scanner(System.in);
        boolean isRunning = true;

        // Loop that will the code until input is === to STOP as string
        while(isRunning){
            System.out.print("\nWelcome to your Terminal Calculator, please pick up your first number, if you want to stop, write STOP: ");

            // Checking if input is a number, if not, check else
            if(input.hasNextInt()){
                // Declaring firstNumber if input is a number
                double firstNumber = input.nextInt();

                // Asking user to insert a number to select 1 of the 4 functions
                System.out.print("Great! You have the following option:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\nWrite the number from the list:");
                double operator = input.nextInt();
    
                System.out.print("\nWrite the next number: ");
                // Declaring secondNumber
                double secondNumber = input.nextInt();
    
                // Checking operator once secondNumber has been declared
                if(operator == 1){
                    System.out.print("Result is: " + (firstNumber + secondNumber));
                }
                if(operator == 2){
                    System.out.print("Result is: " + (firstNumber - secondNumber));
                }
                if(operator == 3){
                    System.out.print("Result is: " + (firstNumber * secondNumber));
                }
                if(operator == 4){
                    System.out.print("Result is: "+ (firstNumber / secondNumber));
                }
            } else {
                    // Retrieving stop to check if string STOP is correct
                    String stop = input.next();
                    if(stop.equals("STOP")){
                        // Exit the loop
                        System.out.print("\nHave a nice day!\n");
                        break;
                    } else {
                        // Working not correct, it restart the loop
                        System.out.print("\nPlease write STOP correctly\n\n");
                    }
            }
        }
        input.close();
    }
}
