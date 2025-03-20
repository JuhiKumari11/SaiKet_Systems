package Calculator.com;
import java.util.Scanner;
public class Calculator {
	    
	    public static double add(double a, double b) {
	        return a + b;
	    }
	    public static double subtract(double a, double b) {
	        return a - b;
	    }

	   
	    public static double multiply(double a, double b) {
	        return a * b;
	    }

	  
	    public static double divide(double a, double b) throws ArithmeticException {
	        if (b == 0) {
	            throw new ArithmeticException("Cannot divide by zero!");
	        }
	        return a / b;
	    }

	    public static void displayMenu() {
	        System.out.println("Welcome to the Basic Calculator");
	        System.out.println("Select an operation:");
	        System.out.println("1. Add");
	        System.out.println("2. Subtract");
	        System.out.println("3. Multiply");
	        System.out.println("4. Divide");
	        System.out.println("5. Exit");
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        boolean continueCalculation = true;

	        while (continueCalculation) {
	           
	            displayMenu();

	         
	            System.out.print("Enter your choice (1-5): ");
	            int choice = scanner.nextInt();

	            
	            if (choice == 5) {
	                System.out.println("Thank you for using the calculator");
	                continueCalculation = false;
	                break;
	            }
	            System.out.print("Enter the first number: ");
	            double a = scanner.nextDouble();

	            System.out.print("Enter the second number: ");
	            double b = scanner.nextDouble();

	            try {
	                
	                double result = 0;
	                switch (choice) {
	                    case 1:
	                        result = add(a, b);
	                        System.out.println("Result: " + result);
	                        break;
	                    case 2:
	                        result = subtract(a, b);
	                        System.out.println("Result: " + result);
	                        break;
	                    case 3:
	                        result = multiply(a, b);
	                        System.out.println("Result: " + result);
	                        break;
	                    case 4:
	                        result = divide(a, b);
	                        System.out.println("Result: " + result);
	                        break;
	                    default:
	                        System.out.println("Invalid choice. Select a valid operation.");
	                        break;
	                }
	            } catch (ArithmeticException e) {
	                
	                System.out.println("Error: " + e.getMessage());
	            }
	            System.out.print("Do you want to perform another operation? (yes/no): ");
	            String response = scanner.next();
	            if (response.equalsIgnoreCase("no")) {
	                continueCalculation = false;
	                System.out.println("Thank you for using the calculator. ");
	            }
	        }
	        scanner.close();
	    }
	}


