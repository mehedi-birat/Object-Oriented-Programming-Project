
import java.util.Scanner;

public class MultiOperationCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        while (continueCalculation) {
            
            System.out.println("\nAssalamualikum, This is a Calculator .please Choose an operation as number for Calculation:");
            System.out.println(" press 1 for -> Addition (+)");
            System.out.println("press 2 for ->  Subtraction (-)");
            System.out.println("press 3 for ->  Multiplication (*)");
            System.out.println("press 4 for ->  Division (/)");
            System.out.println("press 5for ->   Percentage (%)");
            System.out.println("press 6 for ->  Factorial (!)");
            System.out.println("press 7 for ->  Square (x^2)");
            System.out.println("press 8 for ->  Square Root (√x)");
            System.out.print("Enter your choice (1 to 8): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: 
                    System.out.print("How many numbers do you want to add? ");
                    int addCount = scanner.nextInt();
                    double addSum = 0;
                    for (int i = 1; i <= addCount; i++) {
                        System.out.print("Enter number " + i + ": ");
                        addSum += scanner.nextDouble();
                    }
                    System.out.println("Sum = " + addSum);
                    break;
                    

                case 2:
                    System.out.print("Enter first number: ");
                double a2 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double b2 = scanner.nextDouble();
                System.out.println("Result: " + (a2 - b2));
                break;
                

                case 3: 
                    System.out.print("How many numbers do you want to multiply? ");
                    int mulCount = scanner.nextInt();
                    double mulResult = 1;
                    for (int i = 1; i <= mulCount; i++) {
                        System.out.print("Enter number " + i + ": ");
                        mulResult *= scanner.nextDouble();
                    }
                    System.out.println("Result = " + mulResult);
                    break;
                    

                case 4:
                    
                       System.out.print("Enter numerator: ");
                double a4 = scanner.nextDouble();
                System.out.print("Enter denominator: ");
                double b4 = scanner.nextDouble();
                if (b4 != 0)
                    System.out.println("Result: " + (a4 / b4));
                else
                    System.out.println("Error: Cannot divide by zero.");
                break;

                case 5: 
                    System.out.print("Enter total value: ");
                    double total = scanner.nextDouble();
                    System.out.print("Enter obtained value : ");
                    double obtained = scanner.nextDouble();
                    double percent = (obtained / total) * 100;
                    System.out.println("Percentage = " + percent + "%");
                    break;

                case 6: 
                    System.out.print("Enter a non-negative integer: ");
                    int num = scanner.nextInt();
                    if (num < 0) {
                        System.out.println("Error: Factorial not defined for negative numbers.");
                    } else {
                        long fact = 1;
                        for (int i = 1; i <= num; i++) {
                            fact *= i;
                        }
                        System.out.println("Factorial of " + num + " = " + fact);
                    }
                    break;
                    

                case 7: 
                    System.out.print("Enter a number to square: ");
                    double Num = scanner.nextDouble();
                    System.out.println("Square of " + Num + " = " + (Num * Num));
                    break;


                case 8: 
                    System.out.print("Enter a number to find square root: ");
                    double Numbr = scanner.nextDouble();
                    if (Numbr < 0) {
                        System.out.println("Error: Cannot take square root of negative number.");
                    } else {
                        System.out.println("Square root of " + Numbr + " = " + Math.sqrt(Numbr));
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Please select from 1 to 8.");
            }

           
            System.out.print("\nDo you want to perform another operation? (yes/no): ");
            String again = scanner.next();
            continueCalculation = again.equalsIgnoreCase("yes");
        }

        System.out.println("Sukria for using this calculator!");
       
    }
}
