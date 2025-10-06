package Assignment;
import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("MyFrame");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}


