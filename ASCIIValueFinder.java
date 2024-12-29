import java.util.Scanner;

public class ASCIIValueFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter a character
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);
        
        // Display the ASCII value
        int asciiValue = (int) character;
        System.out.println("The ASCII value of '" + character + "' is: " + asciiValue);
        
        scanner.close();
    }
}
