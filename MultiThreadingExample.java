// Class that implements Runnable interface for printing numbers
class NumberPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("NumberPrinter interrupted");
            }
        }
    }
}

// Class that implements Runnable interface for printing letters
class LetterPrinter implements Runnable {
    @Override
    public void run() {
        for (char c = 'A'; c <= 'J'; c++) {
            System.out.println("Letter: " + c);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("LetterPrinter interrupted");
            }
        }
    }
}

public class MultiThreadingExample {
    public static void main(String[] args) {
        // Create instances of NumberPrinter and LetterPrinter
        Runnable numberTask = new NumberPrinter();
        Runnable letterTask = new LetterPrinter();

        // Create threads for the tasks
        Thread numberThread = new Thread(numberTask);
        Thread letterThread = new Thread(letterTask);

        // Start the threads
        numberThread.start();
        letterThread.start();

        // Wait for both threads to complete
        try {
            numberThread.join();
            letterThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Both threads have completed execution");
    }
}
