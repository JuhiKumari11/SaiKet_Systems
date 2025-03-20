package Numbergame.com;
import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        int randomNumber = random.nextInt(100) + 1;
	        int userGuess = 0;
	        int attempts = 0;
	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("I have chosen a random number between 1 and 100.");
	        System.out.println("Try to guess the number!");
	        while (userGuess != randomNumber) {
	            System.out.print("Enter your guess: ");
	            userGuess = scanner.nextInt();
	            attempts++;
	            if (userGuess < randomNumber) {
	                System.out.println("Your guess is too low!");
	            } else if (userGuess > randomNumber) {
	                System.out.println("Your guess is too high!");
	            } else {
	                System.out.println("Congratulations! You've guessed the correct number!");
	                System.out.println("It took you " + attempts + " attempts.");
	            }
	        }
	        scanner.close();
	    }
	}


