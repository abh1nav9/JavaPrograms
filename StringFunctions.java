import java.util.Scanner;

public class StringFunctions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        // Demonstrate length() method
        System.out.println("Length of the string: " + str.length());

        // Demonstrate concat() method
        System.out.println("Enter another string to concatenate:");
        String str2 = scanner.nextLine();
        String concatenatedString = str.concat(str2);
        System.out.println("Concatenated string: " + concatenatedString);

        // Demonstrate replace() method
        System.out.println("Enter the character to replace:");
        char oldChar = scanner.next().charAt(0);
        System.out.println("Enter the new character:");
        char newChar = scanner.next().charAt(0);
        String replacedString = str.replace(oldChar, newChar);
        System.out.println("String after replace: " + replacedString);

        // Demonstrate replaceAll() method
        scanner.nextLine(); // consume newline
        System.out.println("Enter the substring to replace:");
        String oldSubstring = scanner.nextLine();
        System.out.println("Enter the new substring:");
        String newSubstring = scanner.nextLine();
        String replacedAllString = str.replaceAll(oldSubstring, newSubstring);
        System.out.println("String after replaceAll: " + replacedAllString);

        // Demonstrate trim() method
        System.out.println("String after trim: '" + str.trim() + "'");

        // Demonstrate toUpperCase() and toLowerCase() methods
        System.out.println("String in uppercase: " + str.toUpperCase());
        System.out.println("String in lowercase: " + str.toLowerCase());

        // Demonstrate substring() method
        System.out.println("Enter the beginning index for substring:");
        int beginIndex = scanner.nextInt();
        System.out.println("Enter the ending index for substring:");
        int endIndex = scanner.nextInt();
        String substring = str.substring(beginIndex, endIndex);
        System.out.println("Substring: " + substring);

        // Demonstrate charAt() method
        System.out.println("Enter the index to get character:");
        int charIndex = scanner.nextInt();
        char charAt = str.charAt(charIndex);
        System.out.println("Character at index " + charIndex + ": " + charAt);

        // Demonstrate contains() method
        scanner.nextLine(); // consume newline
        System.out.println("Enter a substring to check if it exists in the string:");
        String substringCheck = scanner.nextLine();
        boolean contains = str.contains(substringCheck);
        System.out.println("Does the string contain '" + substringCheck + "': " + contains);
    }
}
