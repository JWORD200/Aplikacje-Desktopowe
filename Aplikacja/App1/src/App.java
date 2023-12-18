import javax.swing.*;

public class App extends JFrame {
    public App() {
        this.setTitle("Application");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 300);
        this.add(new FirstPanel());
        this.add(new SecondPanel());
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        //this.setLayout(new BorderLayout());
    }
}
