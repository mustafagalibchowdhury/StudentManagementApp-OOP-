import javax.swing.*;
import java.awt.*;

public class StudentManagementApp extends JFrame {

    JLabel titleLabel;

    StudentManagementApp() {
        setTitle("Student Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setSize(700, 520);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);

        titleLabel = new JLabel("Student Management System");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        titleLabel.setBounds(190, 15, 350, 35);
        add(titleLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentManagementApp();
    }
}