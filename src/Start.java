import javax.swing.*;
import java.sql.SQLOutput;

public class Start {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createWindow());

    }

    private static void createWindow() {
        System.out.println("Running on EDT? " + SwingUtilities.isEventDispatchThread());
        new MyWindow(new MyPanel());
    }
}
