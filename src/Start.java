import javax.swing.*;

public class Start {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createWindow();
            }
        });
    }

    private static void createWindow() {
        System.out.println("Running on EDT? " + SwingUtilities.isEventDispatchThread());
        new MyWindow(new MyPanel());
    }
}
