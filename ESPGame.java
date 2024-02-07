import java.util.Random;
import java.util.Scanner;
public class ESPGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] colors = {"Red", "Green", "Blue", "Orange", "Yellow"};
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your MC M#: ");
        String mcMNumber = scanner.nextLine();
        
        System.out.print("Describe yourself: ");
        String description = scanner.nextLine();
        
        int correctGuesses = 0;
        
        for (int i = 0; i < 11; i++) {
            int randomNumber = random.nextInt(colors.length);
            String selectedColor = colors[randomNumber];
            
            System.out.print("Guess the color: ");
            String userGuess = scanner.nextLine();
            
            System.out.println("The selected color was: " + selectedColor);
            
            if (userGuess.equalsIgnoreCase(selectedColor)) {
                correctGuesses++;
            }
        }
        
        System.out.println("\nSummary for " + name + " (MC M#: " + mcMNumber + "):");
        System.out.println("Description: " + description);
        System.out.println("Number of correct guesses: " + correctGuesses);
        
        scanner.close();
    }
}