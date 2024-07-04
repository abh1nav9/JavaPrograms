import java.util.Scanner;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a paragraph:");
        String input = scanner.nextLine();

        StringBuffer result = new StringBuffer();
        boolean[] seen = new boolean[256]; // Assuming ASCII character set

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (!seen[currentChar]) {
                seen[currentChar] = true;
                if (currentChar != ' ') {
                    result.append(currentChar);
                }
            }
        }

        System.out.println("The given String is: " + input);
        System.out.println("After removing duplicate characters, the new string is: " + result.toString());

        scanner.close();
    }
}
