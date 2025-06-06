// Import required classes
import java.util.Scanner;

public class LoginSystem {

    public static void main(String[] args) {
        // Predefined correct credentials
        String correctUsername = "admin";
        String correctPassword = "12345";

        // Initialize Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Maximum number of login attempts
        int maxAttempts = 3;

        // Loop to allow 3 login attempts
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.println("Attempt " + attempt + " of " + maxAttempts);

            // Prompt for username
            System.out.print("Enter Username: ");
            String username = scanner.nextLine();

            // Prompt for password
            System.out.print("Enter Password: ");
            String password = "";

            // Read password character by character
            password = scanner.nextLine();

            // Print each character as required while receiving
            System.out.print("You entered password characters: ");
            for (int i = 0; i < password.length(); i++) {
                System.out.print(password.charAt(i) + " ");
            }
            System.out.println(); // Line break

            // Check credentials
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("✅ Login successful!");
                break;
            } else {
                System.out.println("❌ Incorrect username or password.");
                if (attempt == maxAttempts) {
                    System.out.println("🚫 You have exceeded the maximum number of login attempts.");
                } else {
                    System.out.println("🔄 Please try again.\n");
                }
            }
        }

        // Close the scanner
        scanner.close();
    }
}
