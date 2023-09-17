import javax.swing.*;

public class MyWindow extends JFrame {
    public MyWindow(JPanel myPanel) {
        this.setTitle("Jess");
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.add(myPanel);
        this.pack();
        this.setVisible(true);

    }
}
