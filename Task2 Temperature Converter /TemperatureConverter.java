package Temperature.com;
import java.util.Scanner;
public class TemperatureConverter {
	    public static double celsiusToFahrenheit(double celsius) {
	        return (celsius * 9/5) + 32;
	    }
	    public static double fahrenheitToCelsius(double fahrenheit) {
	        return (fahrenheit - 32) * 5/9;
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Temperature Converter");
	        System.out.println("1. Celsius to Fahrenheit");
	        System.out.println("2. Fahrenheit to Celsius");
	        System.out.print("Choose a conversion option (1 or 2): ");
	        int choice = scanner.nextInt();

	        if (choice == 1) {
	            System.out.print("Enter temperature in Celsius: ");
	            double celsius = scanner.nextDouble();
	            double fahrenheit = celsiusToFahrenheit(celsius);
	            System.out.printf("%.2f Celsius = %.2f Fahrenheit\n", celsius, fahrenheit);
	        } else if (choice == 2) {
	            System.out.print("Enter temperature in Fahrenheit: ");
	            double fahrenheit = scanner.nextDouble();
	            double celsius = fahrenheitToCelsius(fahrenheit);
	            System.out.printf("%.2f Fahrenheit = %.2f Celsius\n", fahrenheit, celsius);
	        } else {
	            System.out.println("Invalid choice. Select either 1 or 2.");
	        }

	        scanner.close();
	    }
	}

