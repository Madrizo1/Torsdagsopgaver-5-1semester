//3a

import java.util.Random;
import java.util.Scanner;  

public class GuessANumber {
    private static int rnd_number;
    
    public static void main(String[] args) {
   
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?...");
        makeAGuess();
    }
    
 
    public static void makeAGuess() {
        Scanner scanner = new Scanner(System.in);
        int guess = 0;

       
        while (guess != rnd_number) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();  
            
            if (guess < rnd_number) {
                System.out.println("Too low. Try again.");
            } else if (guess > rnd_number) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("Correct! You guessed the number.");
            }
        }

    
        scanner.close();
    }
}



