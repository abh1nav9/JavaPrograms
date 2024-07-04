import java.util.Scanner;

public class MarksRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int n = scanner.nextInt();

        int[] marks = new int[n];
        System.out.println("Enter the marks of the students:");
        for (int i = 0; i < n; i++) {
            marks[i] = scanner.nextInt();
        }

        // Arrays to hold the count of students in each range
        int[] count = new int[4];

        for (int mark : marks) {
            if (mark >= 81) {
                count[0]++;
            } else if (mark >= 61) {
                count[1]++;
            } else if (mark >= 41) {
                count[2]++;
            } else {
                count[3]++;
            }
        }

        System.out.println("Number of students in the range 81-100: " + count[0]);
        System.out.println("Number of students in the range 61-80: " + count[1]);
        System.out.println("Number of students in the range 41-60: " + count[2]);
        System.out.println("Number of students in the range 0-40: " + count[3]);
    }
}
