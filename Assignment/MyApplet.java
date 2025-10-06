package Assignment;

import javax.swing.*;
import java.awt.*;

public class MyApplet extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(50, 50, 100, 50); // rectangle
        g.drawOval(200, 50, 100, 100); // circle
        g.drawString("Welcome to Java Applets!", 100, 200);
    }
}

