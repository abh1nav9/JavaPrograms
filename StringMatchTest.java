import java.util.Scanner;

public class StringMatchTest {

    // Method to check if the input string matches "India"
    public static void checkString(String input) throws NoMatchException {
        if (!input.equals("India")) {
            throw new NoMatchException("The string does not match 'India'.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String userInput = scanner.nextLine();

        try {
            // Check if the input string matches "India"
            checkString(userInput);
            System.out.println("The string matches 'India'.");
        } catch (NoMatchException e) {
            // Handle the exception if the string does not match
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

/* 

public class NoMatchException extends Exception {
    public NoMatchException(String message) {
        super(message);
    }
}

*/
