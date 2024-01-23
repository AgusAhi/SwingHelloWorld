import javax.swing.*;
import java.awt.*;

public class HelloWorldSwing {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);
        //Display the window.
        frame.setMinimumSize(new Dimension(1366, 768));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
