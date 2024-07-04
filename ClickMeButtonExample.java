import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ClickMeButtonExample {
    public static void main(String[] args) {
        // Ensure the GUI creation is done on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CreateAndShowGUI();
            }
        });
    }

    private static void CreateAndShowGUI() {
        // Create a new frame
        JFrame frame = new JFrame("Click Me Button Example");

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a new button with label "Click Me"
        JButton button = new JButton("Click Me");

        // Add the button to the frame
        frame.add(button);

        // Set the size of the frame
        frame.setSize(300, 200);

        // Set the frame's location to the center of the screen
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}
