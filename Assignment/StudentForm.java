package Assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class StudentForm extends JFrame implements ActionListener {
    JTextField idField, nameField, courseField;
    JButton submit;

    public StudentForm() {
        setTitle("Student Form");
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Student ID:"));
        idField = new JTextField();
        add(idField);

        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Course:"));
        courseField = new JTextField();
        add(courseField);

        submit = new JButton("Submit");
        add(submit);

        submit.addActionListener(this);

        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yourDB", "root", "password");
            PreparedStatement ps = conn.prepareStatement("INSERT INTO students (id, name, course) VALUES (?, ?, ?)");
            ps.setString(1, idField.getText());
            ps.setString(2, nameField.getText());
            ps.setString(3, courseField.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Inserted!");
            conn.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new StudentForm();
    }
}

