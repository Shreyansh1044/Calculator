package Java;

/**
 * SHREYANSH PANDEY
 * 23070126124
 * AIML-B2
 */

// Main class that handles the program's control flow
public class Main {
    public static void main(String[] args) {
        // Create instances of UserInput and Calculator classes
        UserInput userInput = new UserInput();
        Calculator calculator = new Calculator();
        
        int choice; // Variable to store the user's menu choice

        // Loop until the user chooses to exit (choice = 0)
        do {
            // Get the operation choice from the user
            choice = userInput.getOperationChoice();
            
            switch (choice) {
                case 1: // Addition operation
                    double num1 = userInput.getDoubleInput("Enter first number: ");
                    double num2 = userInput.getDoubleInput("Enter second number: ");
                    System.out.println("Addition: " + calculator.add(num1, num2));
                    break;
                case 2: // Subtraction operation
                    num1 = userInput.getDoubleInput("Enter first number: ");
                    num2 = userInput.getDoubleInput("Enter second number: ");
                    System.out.println("Subtraction: " + calculator.subtract(num1, num2));
                    break;
                case 3: // Multiplication operation
                    num1 = userInput.getDoubleInput("Enter first number: ");
                    num2 = userInput.getDoubleInput("Enter second number: ");
                    System.out.println("Multiplication: " + calculator.multiply(num1, num2));
                    break;
                case 4: // Division operation
                    num1 = userInput.getDoubleInput("Enter first number: ");
                    num2 = userInput.getDoubleInput("Enter second number: ");
                    System.out.println("Division: " + calculator.divide(num1, num2));
                    break;
                case 5: // Fibonacci sequence generation
                    int n = userInput.getIntInput("Enter the number of terms for Fibonacci: ");
                    System.out.println("Fibonacci Sequence: " + calculator.fibonacci(n));
                    break;
                case 6: // Calculate the mean of an array
                    double[] array = userInput.getArrayInput();
                    System.out.println("Mean: " + calculator.mean(array));
                    break;
                case 7: // Calculate the mode of an array
                    array = userInput.getArrayInput();
                    System.out.println("Mode: " + calculator.mode(array));
                    break;
                case 0: // Exit the program
                    System.out.println("Exiting...");
                    break;
                default: // Handle invalid choices
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0); // Repeat until user chooses to exit
    }
}
